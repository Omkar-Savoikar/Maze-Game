import com.omkar.cs106.project.maze.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze maze = new Maze();
		Player player = new Player();
		String input = "Y";
		/*
		do {
		 	input = maze.displayStart();
			if(input.compareToIgnoreCase("Y") == 0)
				maze.displayMaze(player);
			else if(input.compareToIgnoreCase("N") == 0)
				break;
			else
				System.out.println("Invalid Input. Enter S or E.");
		 }while(input.compareToIgnoreCase("N") != 0);
		System.out.println("Game Over. Thank You For Playing.");
		*/
		maze.displayMaze(player);
	}

}
