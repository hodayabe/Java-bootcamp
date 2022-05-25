package war;

public class Player {
	
	CardsPack CardsPack1=CardsPack.getCpardsPack();
	private String name;
	private int points;
	private int currCard;
	
	public Player(String name) {
		this.name = name;
		this.points=0;
		this.currCard=0;
	}


	public String getName() {
		return this.name;
	}
	
	public int getPoints() {
		return points;
	}

	public void addPoint() {
		this.points ++;
	}
	
	public int getCurrCard() {
		return currCard;
	}

	
	public void takeNewCard() {
		this.currCard=CardsPack1.getRandomCard();
	}


	@Override
	public String toString() {
		return "name=" + name + ", points: " + points + ", currCard: " + currCard+"\r";
	}
	
	




	
	
	
	
	
	
	
}
