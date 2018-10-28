package com.github.jansowa.boardgame.mechanics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coordinates {
	private int y;
	private int x;
	
	public Coordinates(int[] coord){
		if(coord.length!=2){
			throw new IllegalArgumentException("Array length must equal two");
		}
		else{
			this.y = coord[0];
			this.x = coord[1];
		}
	}
	
	public int[] getCoordinates(){
		return new int[] {this.y, this.x};
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
		if(this.getClass() != obj.getClass()){
			return false;
		}
		Coordinates otherCoordinates = (Coordinates) obj;
		return (this.x==otherCoordinates.x && this.y==otherCoordinates.y);
	}
	
}