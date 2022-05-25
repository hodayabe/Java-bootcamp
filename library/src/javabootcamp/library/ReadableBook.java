package javabootcamp.library;
public class ReadableBook extends Book {

	public ReadableBook(String title, Author author, int quantity) {
		super(title, author, quantity);

	}

	private void read() {
		System.out.println("You can read the book");
		quantity--;
	}
	
	private void returnBook() {
		System.out.println("Thank you for returning the book, hope you enjoyed");
		quantity++;
	}
	
	
	@Override
	public void approach() {
		if(quantity<1) {
			System.out.println("Sorry ... this book is not available for reading");
			return;

		}
		System.out.println("0-return, 1-read");
		int n=(int)(Math.random()*1)+1;

		switch (n) {
		case 0: 
			returnBook();
		case 1:
			read();
		}
			
	}

	



}
