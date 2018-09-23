package com.github.jansowa.boardgame.ai;

import com.github.jansowa.boardgame.domain.GameBoard;
import com.github.jansowa.boardgame.mechanics.Move;

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
	
	public abstract Move nextBotMove();
}
