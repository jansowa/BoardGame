package com.github.jansowa.boardGame.mechanics;

public class Move {
	private Coordinates coordinates;
	
	public Move(Coordinates coordinates){
		this.coordinates = coordinates;
	}
	public Move(int y, int x){
		this.coordinates = new Coordinates(y, x);
	}
	public Move(int[] coordinates){
		if (coordinates.length!=2){
			throw new IllegalArgumentException("Array length must equal two");
		}
		else{
			this.coordinates = new Coordinates(coordinates);
		}
	}
	
	public Coordinates getCoordinates(){
		return this.coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates){
		this.coordinates = coordinates;
	}
	public void setCoordinates(int y, int x){
		this.coordinates = new Coordinates(y, x);
	}
	public void setCoordinates(int[] coord){
		if(coord.length!=2){
			throw new IllegalArgumentException("Array length must equal two");
		}
		else{
			
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
		if(getClass()!=obj.getClass()){
			return false;
		}
		Move otherMove = (Move) obj;
		if(this.coordinates==null){
			if(otherMove.coordinates!=null){
				return false;
			}
		}
		else if(!this.coordinates.equals(otherMove.coordinates)){
			return false;
		}
		return true;
	}
}
