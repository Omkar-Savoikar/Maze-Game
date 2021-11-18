package com.omkar.cs106.project.maze;

public class Player {
	Integer posX;
	Integer posY;
	Boolean win;
	
	public Player() {
		this.posX = 10;
		this.posY = 1;
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}
	
	public Integer moveLeft() {
		this.posX = this.posX - 1;
		return this.posX;
	}
	
	public Integer moveRight() {
		this.posX = this.posX + 1;
		return this.posX;
	}
	
	public Integer moveUp() {
		this.posY = this.posY - 1;
		return this.posY;
	}
	
	public Integer moveDown() {
		this.posY = this.posY + 1;
		return this.posY;
	}
}
