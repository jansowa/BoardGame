package com.github.jansowa.boardgame.ai;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.github.jansowa.boardgame.domain.GameBoard;
import com.github.jansowa.boardgame.mechanics.Move;

@Data
@AllArgsConstructor
public abstract class Bot {
	private GameBoard board;
	
	public abstract Move nextBotMove();
}
