package com.omkar.cs106.project.maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze {
	private Integer height;
	private Integer length;
	private String line0 =  " ________________S_______________";
	private String line1 =  "|_  | _| |___   |     |  ___| __ |";
	private String line2 =  "| |  _  __  |_|_ | |__| _|________|";
	private String line3 =  "|   | _|__ | |  _ |_|  |__  | __| _ _|";
	private String line4 =  "|_|_|_|   |__| |_ |__| _ | |_| __|  |_ |";
	private String line5 =  "|  _| _|_|  |  | _ | _| |_| _ _ | |_ |_|";
	private String line6 =  "|_   __|  |_ | | | _|_ | | _| _|  _| | | |";
	private String line7 =  "| | |_ | | | _| |_| |  |_| _| _| | |_| _| | |";
	private String line8 =  "| |_  | _|_|  |_| _| | _ | _ | |_| | |   |";
	private String line9 =  "| |   |_ | _|__|_ |_| | _|_  __ | |_| | |";
	private String line10 = "|   |__| |_ _|   | _|__|_ |   |  |___|";
	private String line11 = "| |_  |_|_ | |_| | |   |___| |_|_|_|__|_ |";
	private String line12 = "|_| _|__| |_| |  | |_| |_  | | | | | |_  _|";
	private String line13 = "| |_ _| |_ _ | |_|  _| |_|  _   _|  |";
	private String line14 = "|   |  | | |  _|__|_| |  | _|_ | | |_| _| |";
	private String line15 = "| |__| __|_| |__  _|_|_| _| _| | |___| |";
	private String line16 = "|_|_ | _ | |_ |  |_|_  _ |_| _| |_  | |";
	private String line17 = "|    _ _| __|_|_|_| | |_| | |_|__ |__|_| _|";
	private String line18 = "| | |_ |___ ____|__ _|__ _|___ _|";
	private String line19 = "| | | | | _ |  |  | _ |_|_ |__ |  __| |";
	private String line20 = "|_|_|__|__|__|__|__| ___|____|_|____|";
	private String line21 = "____________________E________________";
	
	private String line[] = {line0, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12, line13, line14, line15, line16, line17, line18, line19, line20, line21};
	
	/*
	public Maze(Integer height, Integer weight) {
		this.height = height;
		this.weight = weight;
	}
	*/

	public Integer getHeight() {
		return height;
	}

	public Integer getWeight() {
		return length;
	}

	public Integer getLength() {
		return length;
	}

	public String[] getLine() {
		return line;
	}
	
	public StringBuilder[] createMaze() {
		char[] chars;
		Integer x = 0;
		StringBuilder builder[] = null;
		for(String i : line) {
			chars = i.toCharArray();
			builder[x] = new StringBuilder();
			for(Character c : chars)
				builder[x].append(c);
			x += 1;
		}
		return builder;
	}

	public String displayStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println(line0);
		System.out.println("|               Welcome               |");
		System.out.println("|               Maze Game             |");
		System.out.println("|     Press any key to Start Game     |");
		System.out.println(line20);
		String input = scan.next();
		//scan.getchar();
		return input;
	}
	
	public void displayMaze() {
		for(String i : line) {
			System.out.println(i);
		}
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
		System.out.println(line20);
		String input = scan.next();
		return input;
	}
}
