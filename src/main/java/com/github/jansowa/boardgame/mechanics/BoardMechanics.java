package com.github.jansowa.boardgame.mechanics;

import com.github.jansowa.boardgame.domain.GameBoard;

public abstract class BoardMechanics {
	private GameBoard board;
	
	public BoardMechanics(){
		this.board = null;
	}
	
	public BoardMechanics(GameBoard board){
		this.board = board;
	}
	
	public void setBoard(GameBoard board){
		this.board = board;
	}
	
	public GameBoard getBoard(){
		return board;
	}
	
	//function counts empty fields
	public abstract int emptyFields();
	
	public abstract void restartBoard();
	
	//function returns status of game (draw/win/not end)
	public int singleMove(Move move){
		if(isMovePossible(move)){
			changeBoard(move);
		}
		return isGameOver();
	}

	//function makes changes on board of single move
	public abstract void changeBoard(Move move);

	//function return status of game (draw/win/not end)
	public abstract int isGameOver();
	
	public abstract boolean isMovePossible(Move move);
}
