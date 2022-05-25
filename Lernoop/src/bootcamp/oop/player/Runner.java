package bootcamp.oop.player;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		Random rand = new Random();

		Player player1=new Player(0,2,0,3);
		Player player2=new Player();

		System.out.println("player 1");
		player1.printAllField();
		
		System.out.println("player 2");
		player2.printAllField();
		
		
		for (int i = 0; i < 3; i++) {
			int randInt = rand.nextInt(3)+1;
			switch (randInt) {
			case 1:{
				player1.eatBonus();
				player1.hitObstacle();
				System.out.println("player 1");
				player1.printAllField();
				break;
			}

			case 2:{
				player2.eatBonus();
				player2.hitObstacle();
				System.out.println("player 2");
				player2.printAllField();
				break;
			}
			}
		}

		System.out.println("player 1");
		player1.printAllField();
		
		System.out.println("player 2");
		player2.printAllField();
		
		
		
		
		
		
		
		
		
	}
}
