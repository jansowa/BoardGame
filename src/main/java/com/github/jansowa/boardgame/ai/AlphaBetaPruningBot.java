package com.github.jansowa.boardgame.ai;

import java.util.ArrayList;
import java.util.List;

import com.github.jansowa.boardgame.domain.GameBoard;
import com.github.jansowa.boardgame.mechanics.BoardMechanics;
import com.github.jansowa.boardgame.mechanics.Move;

public abstract class AlphaBetaPruningBot extends Bot {
	public static final int BOT = 0; //"O", maximizer
	public static final int HUPLAYER = 1; //"X", minimizer
	private int maxEvaluate = 10;
	Evaluate evaluate;
	BoardMechanics mechanics;
	
	
	public AlphaBetaPruningBot(GameBoard board, Evaluate evaluate, BoardMechanics mechanics) {
		super(board);
		this.evaluate = evaluate;
		this.mechanics = mechanics;
	}

	public abstract List<Move> emptyIndexes(GameBoard board);
	
	//undo given move
	public abstract void undoMove(Move move);
	
	@Override
	public Move nextBotMove() {
		return findBestMove(this.getBoard());
	}
	
	public int minimaxAlphaBeta(GameBoard newBoard, int depth, int player, int alpha, int beta){
		//player 0  (O) is "maximizer", player 1 (X) is "minimizer"
		int score = evaluate.calculateEvaluation(newBoard, 0);

				//Terminal state - Maximizer won the game
				if(score == maxEvaluate){
					return score-depth;
				}
				
				//Terminal state - Minimizer won the game
				if(score == -maxEvaluate){
					return score+depth;
				}
				
				ArrayList<Move> emptyFields = (ArrayList<Move>) emptyIndexes(newBoard);

				//Terminal state - no fields left and nobody won -> draw game
				if(emptyFields.isEmpty()){
					return 0;
				}
				
				int best=0;
				//maximizer move
				if (player == BOT){
					best = -10000;
				}
				else if(player == HUPLAYER){
					best = 10000;
				}
				
				mechanics.setBoard(newBoard);
				//Try every possible moves
				for(int i=0; i<emptyFields.size(); i++){
					//Single Move
					mechanics.changeBoard(emptyFields.get(i));
					
					//Call minimax for proper player
					if(player==BOT){
						best = Math.max(best,
								minimaxAlphaBeta(newBoard, depth+1, HUPLAYER, alpha, beta));
					}
					else{//player==huPlayer
						best = Math.min(best, 
								minimaxAlphaBeta(newBoard, depth+1, BOT, alpha, beta));
					}
					//Undo move
					undoMove(emptyFields.get(i));
					if(player==BOT){
						alpha = Math.max(alpha, best);
					}
					else{//player==huPlayer
						beta = Math.min(beta, best);
					}
					if(beta<=alpha){
						break;
					}
				}
				return best;
	}

	//Returns best move for Bot (maximizer)
	public Move findBestMove(GameBoard board){
		int bestScores = -1000;
		Move bestMove = null;
		ArrayList<Move> emptyFields = (ArrayList<Move>) emptyIndexes(board);
		int size = emptyFields.size();

		//Try all possible moves
		for(int i=0; i<size; i++){
			//Single move
			mechanics.changeBoard(emptyFields.get(i));
			
			//Calculate scores for this move:
			int moveScores = minimaxAlphaBeta(board, 0, 1, -10000, 10000);
			//Undo move
			undoMove(emptyFields.get(i));
			//Check if move was better then others
			if(moveScores>bestScores){
				bestScores=moveScores;
				bestMove=emptyFields.get(i);
			}
		}
		return bestMove;
	}
}
