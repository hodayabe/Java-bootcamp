package javabootcamp.libraryRunner;
import javabootcamp.library.Author;
import javabootcamp.library.Book;
import javabootcamp.library.BorrowNBuyBook;
import javabootcamp.library.BorrowableBook;
import javabootcamp.library.ReadableBook;

public class Runner {

	public static void main(String[] args) {

		Author a=new Author("abc", 'f');
		Book [] bookArr=new Book[6];
		bookArr[0]=new BorrowableBook( "yamy",a, 20, "12/4/22");
		bookArr[1]=new BorrowableBook( "yamy",a, 20, "12/4/22");
		bookArr[2]=new ReadableBook("jjj", a, 5);
		bookArr[3]=new ReadableBook("jjj", a, 5);
		bookArr[4]=new BorrowNBuyBook("k", a, 4, 30, "12/4/22");
		bookArr[5]=new BorrowNBuyBook( "yamy",a,5,20, "12/4/22");
		
		
		for (int i = 0; i < bookArr.length; i++) {
			bookArr[i].approach();	
		}



			
		
		
	}
}
