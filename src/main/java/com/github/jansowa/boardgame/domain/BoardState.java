package com.github.jansowa.boardgame.domain;

import lombok.Data;

@Data
public class BoardState {
	private final GameBoard board;
	private final int state;
}
