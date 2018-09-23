package com.github.jansowa.boardgame.mechanics;

import com.github.jansowa.boardgame.domain.GameBoard;

public abstract class GameDAO {
	public abstract GameBoard loadGame(String gameName);
	public abstract void saveGame(GameBoard board);
}
