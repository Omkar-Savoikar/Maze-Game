package com.omkar.cs106.project.maze;

public class Cell {
	private Boolean left;
	private Boolean down;
	private Boolean playerPresent;
	
	public Cell(Boolean left, Boolean down) {
		this.left = left;
		this.down = down;
		this.playerPresent = false;
	}

	public Boolean getLeft() {
		return left;
	}

	public Boolean getDown() {
		return down;
	}
	
	public Boolean getPlayerPresent() {
		return playerPresent;
	}

	public void setPlayerPresent(Boolean playerPresent) {
		this.playerPresent = playerPresent;
	}

	public void printCell() {
		if (left == true)
			System.out.print("|");
		else
			System.out.print(" ");
		if (playerPresent == true)
			if (down == true)
				System.out.print("_O_");
			else
				System.out.print(" O ");
		else
			if (down == true)
				System.out.print("___");
			else
				System.out.print("   ");
	}
}
