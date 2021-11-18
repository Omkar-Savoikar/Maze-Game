package com.omkar.cs106.project.maze;

import java.util.Scanner;

public class Maze {
	private String line0 =  " ________________ _______________";
	private String line1 =  "|_  | _| |___   |     |  ___| __ |";
	private String line2 =  "| |  _  __  |_|_ | |__| _|________|";
	private String line3 =  "|   | _|__ | |  _ |_|  |__  | __| _ _|";
	private String line4 =  "|_|_|_|   |__| |_ |__| _ | |_| __|  |_ |";
	private String line5 =  "|  _| _|_|  |  | _ | _| |_| _ _ | |_ |_|";
	private String line6 =  "|_   __|  |_ | | | _|_ | | _| _|  _| | | |";
	private String line7 =  "| | |";
	private String line8 =  "| |_";
	private String line9 =  "| |";
	private String line10 = "| ";
	private String line11 = "| ";
	private String line12 = "|_";
	private String line13 = "| ";
	private String line14 = "| ";
	private String line15 = "| ";
	private String line16 = "|_";
	private String line17 = "| ";
	private String line18 = "| ";
	private String line19 = "| ";
	private String line20 = "|_";
	
	private String line[] = {line0, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12, line13, line14, line15, line16, line17, line18, line19, line20};
	
	
	public String displayStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println(line0);
		System.out.println("|               Welcome               |");
		System.out.println("|               Maze Game             |");
		System.out.println("|     Press any key to Start Game     |");
		System.out.println(line20);
		String input = scan.next();
		return input;
	}
	
	public void displayMaze() {
		System.out.println(line0);
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);
		System.out.println(line7);
		System.out.println(line8);
		System.out.println(line9);
		System.out.println(line10);
		System.out.println(line11);
		System.out.println(line12);
		System.out.println(line13);
		System.out.println(line14);
		System.out.println(line15);
		System.out.println(line16);
		System.out.println(line17);
		System.out.println(line18);
		System.out.println(line19);
		System.out.println(line20);
	}
	
	public String displayEnd(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(line0);
		if(player.win == true) {
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
