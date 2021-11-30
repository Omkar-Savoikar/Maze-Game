package com.omkar.cs106.project.maze;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private Integer posX;
	private Integer posY;
	private Boolean win;
	
	public Player() {
		this.posX = 10;
		this.posY = 1;
		this.win = false;
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
	
	public Integer moveLeft(Maze maze) {
		updateString(maze, ' ');
		this.posX = this.posX - 1;
		updateString(maze, 'O');
		return this.posX;
	}
	
	public Integer moveRight(Maze maze) {
		updateString(maze, ' ');
		this.posX = this.posX + 1;
		updateString(maze, 'O');
		return this.posX;
	}
	
	public Integer moveUp(Maze maze) {
		updateString(maze, ' ');
		this.posY = this.posY - 1;
		updateString(maze, 'O');
		return this.posY;
	}
	
	public Integer moveDown(Maze maze) {
		updateString(maze, ' ');
		this.posY = this.posY + 1;
		updateString(maze, 'O');
		return this.posY;
	}
	
	public void updateString(Maze maze, char chars) {
		StringBuilder line[] = null;
		StringBuilder x;
		line = maze.createMaze();
		line[this.posY].setCharAt(this.posX, chars);
	}
}
