package com.github.jansowa.boardGame.mechanics;

public class Coordinates {
	private int y;
	private int x;
	
	public Coordinates(int y, int x){
		this.y = y;
		this.x = x;
	}
	
	public Coordinates(int[] coord){
		if(coord.length!=2){
			throw new IllegalArgumentException("Array length must equal two");
		}
		else{
			this.y = coord[0];
			this.x = coord[1];
		}
	}
	
	public int getX(){
		return this.x;
	}
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public int[] getCoordinates(){
		int[] result = {this.y, this.x};
		return result;
	}
	public void setCoordinates(int y, int x){
		this.y = y;
		this.x = x;
	}
	public void setCoordinates(int[] coord){
		if(coord.length!=2){
			throw new IllegalArgumentException("Array length must equal 2");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		Coordinates otherCoordinates = (Coordinates) obj;
		if(this.x==otherCoordinates.x && this.y==otherCoordinates.y){
			return true;
		}
		else{
			return false;
		}
	}
	
}
