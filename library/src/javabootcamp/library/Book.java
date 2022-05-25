package javabootcamp.library;

public abstract class Book implements Readable {
 
	protected String title;
	protected Author author;
	protected int quantity;
	
	
	public Book(String title, Author author, int quantity) {
		super();
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}
	
	

	public abstract void approach();

	

	enum type {
		KOOKING_BOOKS,
		  NIVELS,
		  DICTIONARIES,
		}
	
	
	
	
	
	
}
