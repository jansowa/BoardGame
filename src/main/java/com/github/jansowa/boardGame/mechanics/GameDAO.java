package com.github.jansowa.boardGame.mechanics;

import com.github.jansowa.boardGame.domain.GameBoard;

public abstract class GameDAO {
	public abstract GameBoard loadGame(String gameName);
	public abstract void saveGame(String gameName);
}
