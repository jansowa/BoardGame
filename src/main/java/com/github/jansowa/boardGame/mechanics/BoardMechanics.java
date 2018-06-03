package com.github.jansowa.boardGame.mechanics;

import com.github.jansowa.boardGame.domain.GameBoard;

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
	public int singleMove(String field){
		changeBoard(field);
		return isGameOver();
	};

	//function makes changes on board of single move
	public abstract void changeBoard(String field);

	//function return status of game (draw/win/not end)
	public abstract int isGameOver();
	
	public abstract boolean isMovePossible(String field);
}
