package com.omkar.cs106.project.maze;

public class Enemy {
	private Integer fPosX;
	private Integer fPosY;
	private Integer tPosX;
	private Integer tPosY;
	private String rep;
	
	public Enemy(Integer fPosX, Integer fPosY, Integer tPosX, Integer tPosY) {
		this.fPosX = fPosX;
		this.fPosY = fPosY;
		this.tPosX = tPosX;
		this.tPosY = tPosY;
		this.rep = "<>";
	}
	
	public Integer getfPosX() {
		return fPosX;
	}

	public void setfPosX(Integer fPosX) {
		this.fPosX = fPosX;
	}

	public Integer getfPosY() {
		return fPosY;
	}

	public void setfPosY(Integer fPosY) {
		this.fPosY = fPosY;
	}

	public Integer gettPosX() {
		return tPosX;
	}

	public void settPosX(Integer tPosX) {
		this.tPosX = tPosX;
	}

	public Integer gettPosY() {
		return tPosY;
	}

	public void settPosY(Integer tPosY) {
		this.tPosY = tPosY;
	}

	public String getRep() {
		return rep;
	}

	public void move() {
		//figure out how to run a function in background
	}

}
