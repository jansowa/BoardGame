package com.github.jansowa.boardGame.mechanics;

import com.github.jansowa.boardGame.controller.GameController;
import com.github.jansowa.boardGame.domain.GameBoard;

public abstract class GameStarter {
	GameBoard board;
	AI ai;
	GameController view;
	GameDAO dao;
	
	GameStarter(GameBoard board, AI ai, GameController view, GameDAO dao){
		this.board = board;
		this.ai = ai;
		this.view = view;
		this.dao = dao;
	}
	
	public void startGame(){
		//TODO
	};
	
	public abstract void singlePlayer();
	
	public abstract void multiPlayer();
	
	public abstract void loadGame();
	
	public abstract void saveGame();
	
	public abstract void playerMove();
}
