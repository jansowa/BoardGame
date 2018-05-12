package com.github.jansowa.boardGame.mechanics;

import com.github.jansowa.boardGame.domain.GameBoard;

public abstract class AI {
	private GameBoard board;
	
	public void setBoard(GameBoard board){
		this.board = board;
	}
	public GameBoard getBoard(){
		return this.board;
	}
	
	abstract public String nextAIMove();
}
