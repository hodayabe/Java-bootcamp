package javabootcamp.library;
import java.util.Date;

public class BorrowNBuyBook extends BorrowableBook implements Purchasable{
	

	protected float price;

	public BorrowNBuyBook(String title, Author author, int quantity,float price, String borrowingPeriod) {
		super(title, author, quantity, borrowingPeriod);
		this.price=price;
	}
	
	
	private void buy() {
		System.out.println("You can buy the book te price is:"+price+" enjoy reading!");
		quantity--;
	}
	
	public void returnBook() {
		System.out.println("Thank you for returning the book, hope you enjoyed");
		quantity++;
	}
	
	public void approach() {
		if(quantity<1) {
			System.out.println("Sorry ... You can not buy the book");
			return;

		}
		System.out.println("0-return, 1-buy");
		int n=(int)(Math.random()*1)+1;

		
		switch (n) {
		case 0: 
			returnBook();
		case 1:
			buy();
		}
	}
	
	
	
	
}
