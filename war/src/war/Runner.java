package war;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Player> players=new ArrayList();
		players.add(new Player("dan"));
		players.add(new Player("sam"));
		players.add(new Player("jon"));
		players.add(new Player("nil"));
		
		
		Game game =new Game(players);
		game.play();		
		
		
		
}
	
	
	
	
}
