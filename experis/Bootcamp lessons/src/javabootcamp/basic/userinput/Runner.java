package javabootcamp.basic.userinput;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//check if a number is in range
		int numToCheck, start, end;
		System.out.println("First: ");
		numToCheck = scanner.nextInt();
		System.out.println("Second: ");
		start = scanner.nextInt();
		System.out.println("Third: ");
		end = scanner.nextInt();
		// swap 
		if(start>end) {
			int temp = end;			
			end = start;
			start = temp;
		}

		String res = "";
		if (numToCheck < start) {
			res = "Smaller than ";
		}else if(numToCheck > end) 
		{
			res = "Greather than ";
		}else {
			res = "in " ;
		}

		String finalRes = numToCheck + " is "+res+"the range "+start +" to "+end;
		System.out.println(finalRes);
	
		int year, month;
		System.out.print("Enter a year: ");
		year = scanner.nextInt();
		System.out.print("Enter a month number: ");
		month = scanner.nextInt();
	    if(year<0 || month<1 ||month>12) {
	    	System.out.println("Invalid month value");
	    	return;
	    }
	    	
		switch (month) {
		case 1: {
		  System.out.println("January "+year+ " has 31 days");
		  break;
		}
		case 2: {
			if(year%4==0)
				System.out.println("February "+year+ " has 29 days");
			else 
				System.out.println("February "+year+ " has 28 days");
			  break;
			}
		case 3: {
			  System.out.println("March "+year+ " has 31 days");
			  break;
			}
		case 4: {
			  System.out.println("April "+year+ " has 30 days");
			  break;
			}
		case 5: {
			  System.out.println("May "+year+ " has 31 days");
			  break;
			}
		case 6: {
			  System.out.println("June "+year+ " has 30 days");
			  break;
			}
		case 7: {
			  System.out.println("July "+year+ " has 31 days");
			  break;
			}
		case 8: {
			  System.out.println("August "+year+ " has 31 days");
			  break;
			}
		case 9: {
			  System.out.println("September "+year+ " has 30 days");
			  break;
			}
		case 10: {
			  System.out.println("October "+year+ " has 31 days");
			  break;
			}
		case 11: {
			  System.out.println("November "+year+ " has 30 days");
			}
		case 12: {
			  System.out.println("December "+year+ " has 31 days");
			  break;
			}
		}
		
		scanner.close();

	}

}
