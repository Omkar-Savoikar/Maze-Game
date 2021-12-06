package com.omkar.cs106.project.maze;

public class Player {
	private Integer posX;
	private Integer posY;
	private Boolean win;
	private char rep;
	
	public Player() {
		this.posX = 0;
		this.posY = 12;
		this.win = null;
		this.rep = 'O';
	}

	public Integer getPosX() {
		return posX;
	}
	
	public void setPosX(Integer posX) {
		this.posX = posX;
	}

	public Integer getPosY() {
		return posY;
	}
	
	public void setPosY(Integer posY) {
		this.posY = posY;
	}
	
	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}
	
	public char getRep() {
		return rep;
	}
	
	//before moving player, check if player can move to the position or not
	public Integer moveLeft(Maze maze) {
		this.posX = this.posX - 1;
		return this.posX;
	}
	
	public Integer moveRight(Maze maze) {
		this.posX = this.posX + 1;
		return this.posX;
	}
	
	public Integer moveUp(Maze maze) {
		this.posY = this.posY - 1;
		return this.posY;
	}
	
	public Integer moveDown(Maze maze) {
		this.posY = this.posY + 1;
		return this.posY;
	}

}
