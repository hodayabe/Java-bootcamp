package bootcamp.oop.exe1;

import java.util.Random;
import java.util.Scanner;

public class Runner {
	static Scanner sc = new Scanner(System.in);

	public static void printMenu() {
		String menuText = "Please enter the number of your selection from the following options:\r\n";
		menuText += "1. Enter 2 sentences and I’ll tell you if one is the other written backwards.\r\n";
		menuText += "2. Enter a word and I’ll tell you if it is a palindrome.\r\n";
		menuText += "3. Enter a sentence and a word and I’ll remove that word from anywhere in the sentence for you.\r\n";
		menuText += "4. Enter a sentence and I’ll capitalize the beginning of each word in it.\r\n";
		menuText += "5. Enter a sentence and 2 words and I’ll replace that first word with the second from everywhere in the sentence for you.\r\n";
		menuText += "6. Enter a sentence and a letter and I’ll print all the words that start with that letter.\r\n";
		menuText += "7. Exit\r\n";
		System.out.println(menuText);
	}

	
	public static void userInput1() {
		String res="The sentences are not reversed";
		System.out.println("Enter a first sentence");
		String str1=sc.nextLine();
		System.out.println("Enter a second sentence");
		String str2=sc.nextLine();
		if(isReversed(str1,str2))
			res="The sentences are reversed";
			
		System.out.println(res);
	}
	
	
	public static void userInput2() {
		String res="The word is not palindrome";
		System.out.println("Enter a word");
		String word=sc.nextLine();
		if(isPalindrome(word))
			res="The word is palindrome";
			
		System.out.println(res);
	}
	
	
	public static void userInput6() {
		
		System.out.println("Enter a sentence");
		String str=sc.nextLine();
		System.out.println("Enter a letter");
		char c=sc.next().charAt(0);
			
		PrintsTheWordsThatStartWithTheLetter(str,c);
	}
	
	
	public static boolean isReversed(String str1,String str2) {
		if(str1.length()!=str2.length())
			return false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(str2.length()-1-i))
				return false;
		}
		return true;
	}


	public static boolean isPalindrome(String word) {
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i))
				return false;
		}
		return true;
	}
	
	public static void PrintsTheWordsThatStartWithTheLetter(String str,char c) {
		int i=0;
		
		for (; i< str.length(); i++) {
			if(str.charAt(i) == c &&  str.charAt(i-1)==' ')
				while(str.charAt(i) != ' ') {
					System.out.println();
					i++;
				}
		}
		
	}
	
	public static void main(String[] args) {
		
		int menue=0;
		do {
			printMenu();
			menue=sc.nextInt();

			switch (menue) {
			case 1: {
				userInput1();
				break;
			}
			case 2: {
				userInput2();
				break;
			}
			case 3: {

			}
			case 4: {

			}
			case 5: {

			}
			case 6: {
				userInput6();
			}
			case 7: {
				System.out.println("by");
				break;
			}
			default:{
				System.out.println("Enter again");
				break;
			}
			}	


		}while(menue!=7);

	}

}
