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
	
	public abstract void restartBoard();
	
	public abstract void singleMove(String move);
	
	public abstract int isGameOver();
}
