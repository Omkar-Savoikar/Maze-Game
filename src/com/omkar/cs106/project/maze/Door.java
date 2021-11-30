package com.omkar.cs106.project.maze;

public class Door {
	private Integer posX;
	private Integer posY;
	
	public Door(Integer posX, Integer posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public Integer getPosX() {
		return posX;
	}

	public Integer getPosY() {
		return posY;
	}
}