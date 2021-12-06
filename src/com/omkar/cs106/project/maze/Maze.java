package com.omkar.cs106.project.maze;

import java.util.Scanner;

public class Maze {
	private Integer height;
	private Integer length;
	//4 cases of a cell
	//private Cell c1 = new Cell(true, true); both
	//private Cell c2 = new Cell(true, false); only left
	//private Cell c3 = new Cell(false, true); only down
	//private Cell c4 = new Cell(false, false); empty
	private Cell[][] cell = { //20x25
			{new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(true, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(true, false)},
			{new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(true, false)},
			{new Cell(true, true), new Cell(true, true), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(true, true), new Cell(true, true), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(true, false)},
			{new Cell(true, true), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, false), new Cell(true, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(true, true), new Cell(true, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, false), new Cell(true, false)},
			{new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(false, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(true, true), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, true), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, true), new Cell(true, true), new Cell(false, false), new Cell(false, false), new Cell(false, true), new Cell(false, false), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(false, false), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(true, true), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(true, false), new Cell(false, true), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, false), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, false), new Cell(false, true), new Cell(true, false)},
			{new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(true, false), new Cell(false, true), new Cell(false, false), new Cell(true, true), new Cell(true, true), new Cell(false, false), new Cell(true, true), new Cell(false, true), new Cell(false, false), new Cell(true, false), new Cell(false, false), new Cell(false, true), new Cell(false, true), new Cell(true, false), new Cell(true, false)},
			{new Cell(true, true), new Cell(true, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(true, false), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, true), new Cell(true, true), new Cell(false, true), new Cell(false, true), new Cell(false, true), new Cell(true, false)}
			};
	private String line0 = " _______________________________________________  S  ________________________________________________";
	private String line1 = "|_______________________________________________  E  _______________________________________________|";
	private String line[] = {line0, line1};
	
	public Maze() {
		this.height = 20;
		this.length = 25;
		this.cell[0][12].setPlayerPresent(true);
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getLength() {
		return length;
	}

	public String displayStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println(line0);
		System.out.println("|                                              Welcome                                              |");
		System.out.println("|                                             Maze Game                                             |");
		System.out.println("|                                       Press Y to Start Game                                       |");
		System.out.println("|                                       Press N to Exit Game                                        |");
		System.out.println(line1);
		String input = scan.nextLine();
		//scan.getchar();
		scan.close();
		return input;
	}
	
	public void displayMaze(Player player) {
		System.out.println();
		System.out.println(line0);
		for (int i = 0; i < getHeight(); i++) {
			for (int j = 0; j <= getLength(); j++)
				cell[i][j].printCell();
			System.out.println();
		}
		System.out.println(line1);
		System.out.println();
	}
	
	public String displayEnd(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(line0);
		if(player.getWin() == true) {
			System.out.println("|           Congratulations           |");
			System.out.println("|               You Won               |");
			System.out.println("|        Press Y to start again       |");
			System.out.println("|         Press N to end game         |");
		}
		else {
			System.out.println("|                Sorry                |");
			System.out.println("|              You Loose              |");
			System.out.println("|        Press Y to start again       |");
			System.out.println("|         Press N to end game         |");
		}
		System.out.println(line1);
		String input = scan.next();
		scan.close();
		return input;
	}
}
