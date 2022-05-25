package javabootcamp.library;
public class BorrowableBook extends Book implements Borrowable {

	protected String borrowingPeriod;

	public BorrowableBook(String title, Author author, int quantity,String borrowingPeriod) {
		super(title, author, quantity);

		this.borrowingPeriod=borrowingPeriod;



	}

	private void borrow() {
		System.out.println("You can borrow the book");
		quantity--;
	}


	public void returnBook() {
		System.out.println("Thank you for returning the book, hope you enjoyed");
		quantity++;
	}


	public void approach() {
		if(quantity<1) {
			System.out.println("Sorry ... The book cannot be borrowed");
			return;

		}
		System.out.println("0-return, 1-borrow");
		int n=(int)(Math.random()*1)+1;

		switch (n) {
		case 0: 
			returnBook();
		case 1:
			borrow();
		}
	}
	
	
}
