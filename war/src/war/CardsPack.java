package war;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardsPack {
	
	private final int NUM_OF_CARDS=60;
	private List<Integer> cards;
	private static CardsPack cardsPack =null;

	
	private CardsPack() {
		initCards();
	}
	
	public static CardsPack getCpardsPack() {
		if(cardsPack==null)
			cardsPack=new CardsPack();
		
		return cardsPack;
	}
	
	public List<Integer> getCards(){
		return this.cards;
	}
	
	private void initCards() {
		this.cards=new LinkedList<>();
		for (int i = 1; i <=NUM_OF_CARDS; i++) {
			cards.add(i);
		}
	}
	
	
	public int getRandomCard() {
		int size=cards.size();
		if(size<=0)
			return-1;
		Random rand=new Random();
		int randomCard= rand.nextInt(size);
		return delite(randomCard);
	}
	

	private int delite(int randomCard) {
		return cards.remove(randomCard);
	}
	
	
	public void printList() {
		cards.stream().forEach(i->System.out.print(i));
	}

}
