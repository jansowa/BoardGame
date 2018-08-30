package com.github.jansowa.boardGame.ai;

import com.github.jansowa.boardGame.domain.GameBoard;

public abstract class Evaluate {
	public abstract int calculateEvaluation(GameBoard board, int player);
}
