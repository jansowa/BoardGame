package com.github.jansowa.boardgame.domain;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class GameBoard implements Cloneable {
	private String name;
	private int[][] fields;
	private int numberOfPlayers;
	private int player; //current player
	
	public GameBoard(){
		this.name = "";
		this.numberOfPlayers = 2;
		this.player = 0;
		this.fields = null;
	}
	
	public GameBoard(String name, int numberOfPlayers, int player){
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.player = player;
		this.fields = null;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		GameBoard cloned = (GameBoard) super.clone();
		cloned.setFields(cloned.getFields().clone());
		return cloned;
	}

}
