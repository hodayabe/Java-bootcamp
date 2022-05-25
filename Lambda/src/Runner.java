import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<>(); 
		
		persons.add(new Person("d", "h", 15));
		persons.add(new Person("hodaya", "hoho", 20));
		persons.add(new Person("ff", "h", 40));
		persons.add(new Person("lala", "h", 2));
		persons.add(new Person("dan", "h", 7));
		
		//print
		System.out.println("\r-----------------\r");
		persons.forEach((p) -> System.out.println(p + ", "));
		
		
		
		//Sort by last name
		System.out.println("\r-----------------\r");
		System.out.println("Sort by last name");
		
		persons.sort((p1,p2) -> {
			if(p1.getLastName().charAt(0) == p2.getLastName().charAt(0))
				return 0;
			if(p1.getLastName().charAt(0) < p2.getLastName().charAt(0))
				return 1;
			return -1;
		});
		
		persons.forEach((p) -> System.out.println(p + ", "));
		
		
		//print the people who don’t have the letter o in their first name and
		System.out.println("\r-----------------\r");
		System.out.println("print the people who don’t have the letter o in their first name and");
		
		persons.forEach((p) -> {
			if(p.getFirstName().contains("o") || p.getFirstName().contains("O")) 
				System.out.println(p + ", ");
		});
		
		
		//create a list of people under the age of 21 and print them
		System.out.println("\r-----------------\r");
		System.out.println("list of people under the age of 21");
		
		
		ArrayList<Person> under21 = new ArrayList<>();  
		persons.forEach((p) -> {
			if(p.getAge()<21) {
				under21.add(p);
			}
		});
		
		under21.forEach((p) -> System.out.println(p + ", "));
		
		
		
		
		
		
		
}
}