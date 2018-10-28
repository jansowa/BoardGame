package com.github.jansowa.boardgame.mechanics;

import com.github.jansowa.boardgame.ai.Bot;
import com.github.jansowa.boardgame.domain.BoardState;
import com.github.jansowa.boardgame.domain.GameBoard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class GameUI {
	private BoardMechanics mechanics;
	private GameBoard board;
	private Bot ai;
	
	public abstract BoardState singleMove(String field);
	
	public GameBoard singlePlayer(){
		mechanics.restartBoard();
		this.board.setNumberOfPlayers(1);
		mechanics.singleMove(ai.nextBotMove());
		return this.board;
	}
	
	public GameBoard multiPlayer(){
		mechanics.restartBoard();
		this.board.setNumberOfPlayers(2);
		return this.board;
	}
}
