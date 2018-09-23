package com.github.jansowa.boardgame.ai;

import com.github.jansowa.boardgame.domain.GameBoard;

public abstract class Evaluate {
	public abstract int calculateEvaluation(GameBoard board, int player);
}
