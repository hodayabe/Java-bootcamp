package bootcamp.oop.player;

import java.util.Random;


public class Player {
	
	//fields
	private static int totalPoints;
	private static int numPlayers;
	private int points;
	private int lives;
	
	
	//Constructor
	
	public Player(int totalPoints , int numPlayers,int points,int lives){
		setTotalPoints(totalPoints);
		setNumPlayers(numPlayers);
		setPoints(points);
		setLives(lives);
	}
	
	public Player() {
		this(0,1,0,3);
	}
	
	
	//method
	

	private void setTotalPoints(int totalPoints1) {
		totalPoints = totalPoints1;
	}

	

	private void setNumPlayers(int numPlayers1) {
		if(numPlayers>0 && numPlayers<4)
			numPlayers = numPlayers1;
		else	
			numPlayers = 1;
	}
	
	

	private void setPoints(int points) {
		this.points = points;
	}



	private void setLives(int lives) {
		if(lives>-1 && lives<6)
			this.lives = lives;		
	}

	
	public void eatBonus(){
		Random rand = new Random();
		int randInt = (rand.nextInt(2)*149)+1;
	}
	
	
	public  void hitObstacle() {
	Random rand = new Random();
	int randInt = (rand.nextInt(2)+1)*100;
	setTotalPoints(totalPoints-randInt);
	setPoints(points-randInt);
	 checkLives();
	}
	
	
	private void addPoints(int numPoints){
		if(numPoints>150)
			setLives(lives+1);
		setTotalPoints(totalPoints+numPoints);
		setPoints(points+numPoints);
		}
	
	
	private void subtractPoints(int numPoints) {
		 if(numPoints<100)
				setLives(lives-1);
			setPoints(points-numPoints);
			 checkLives();
	 }
	
	 
	private void checkLives() {
		if(lives==0)
			setLives(numPlayers-1);
	}
	
	
	
	
	public void printAllField(){
		System.out.print("total Points: "+totalPoints);
		System.out.print(" Num of players: "+ numPlayers);
		System.out.print(" points: "+points);
		System.out.println(" lives: "+lives);
	}
	
	
	
	}
	