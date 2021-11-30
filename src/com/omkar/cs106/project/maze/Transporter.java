package com.omkar.cs106.project.maze;

public class Transporter {
	private Door d1;
	private Door d2;
	
	public Transporter(Integer d1X, Integer d1Y, Integer d2X, Integer d2Y) {
		d1 = new Door(d1X, d1Y);
		d2 = new Door(d2X, d2Y);
	}
	
	public void transport(Player player) {
		//if player is at one door, move it to the other one
		if(player.getPosX() == d1.getPosX()) {
			if(player.getPosY() == d1.getPosY()) {
				player.setPosX(d2.getPosX());
				player.setPosY(d2.getPosY());
			}
		}
		if(player.getPosX() == d2.getPosX()) {
			if(player.getPosY() == d2.getPosY()) {
				player.setPosX(d1.getPosX());
				player.setPosY(d1.getPosY());
			}
		}
	}
}
