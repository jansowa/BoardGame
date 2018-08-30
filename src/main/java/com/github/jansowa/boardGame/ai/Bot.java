package com.github.jansowa.boardGame.ai;

import com.github.jansowa.boardGame.domain.GameBoard;
import com.github.jansowa.boardGame.mechanics.Move;

public abstract class Bot {
	private GameBoard board;
	
	public Bot(GameBoard board){
		this.board = board;
	}
	
	public void setBoard(GameBoard board){
		this.board = board;
	}
	public GameBoard getBoard(){
		return this.board;
	}
	
	abstract public Move nextAIMove();
}
