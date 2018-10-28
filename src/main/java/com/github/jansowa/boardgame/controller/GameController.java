package com.github.jansowa.boardgame.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.github.jansowa.boardgame.domain.BoardState;
import com.github.jansowa.boardgame.domain.GameBoard;
import com.github.jansowa.boardgame.mechanics.GameUI;

@AllArgsConstructor
@Data
public abstract class GameController {
	private GameUI ui;
	public BoardState singleMove(String field){
		return ui.singleMove(field);
	}
	public GameBoard singlePlayer(){
		return ui.singlePlayer();
	}
	public GameBoard multiPlayer(){
		return ui.multiPlayer();
	}
}
