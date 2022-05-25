package war;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Game {
	
	CardsPack CardsPack2=CardsPack.getCpardsPack();
	private final int MAX_PLAYERS=4;
	private final int MIN_PLAYERS=2; 
	private List<Player> players;
	private Player winner;
	
	
	public Game( List<Player> players) {
		this.players = new ArrayList<>(players);
		this.winner=null;
	}
	
	
	public void cardsDistribute() {
		for (Iterator iterator = players.iterator(); iterator.hasNext();) {
			Player player = (Player) iterator.next();
			player.takeNewCard();
		}
	}
	
	
	public void UpdateRuondWinner() {
		winner= Collections.max(players, (p1, p2)->p1.getCurrCard()-p2.getCurrCard());
	}
	
	public void UpdateFinalWinner() {
		winner= Collections.max(players, (p1, p2)->p1.getPoints()-p2.getPoints());
	}
	
	public void play() {
		
		while(CardsPack2.getCards().size()>0) {
			System.out.println(players);
			cardsDistribute();
			UpdateRuondWinner();
			winner.addPoint();
			System.out.println("**************************");

		}
	
		UpdateFinalWinner();
		System.out.println("the final winner is: "+ winner.getName()+" whis "+winner.getPoints()+" points" );
		
	}
	
	
	

	
	
}
