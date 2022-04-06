package javabootcamp.basic.ex6;

import java.util.Iterator;
import java.util.Scanner;

public class Runner {
	//Q1
	public static int bigger(int num) {
		int temp=0;
		int newNum=0;
		int ten=1;

		while(num!=0) {
			temp=num%10;
			num/=10;
			if(temp==9)
				newNum+=0;
			else	
				newNum+=(temp+1)*ten;
			ten*=10;
		}
		return newNum;
	}


	//Q2
	public static int newNum(int num1,int num2) {
		int temp1=0, temp2=0;
		int newNum=0;
		int ten=1;

		//Summarized each time the smaller digit
		while(num1!=0 && num2!=0) {
			temp1=num1%10;
			num1/=10;
			temp2=num2%10;
			num2/=10;
			if(temp1>temp2)
				newNum+=temp2*ten;
			else	
				newNum+=temp1*ten;
			ten*=10;
		}
		
		if(num1!=num2)
			return -1;
		
		return newNum;
	}

	
	//Q3
	public static String isWeighted(int num) {
		int sum=0;
			for (int j = 1; j < num; j++) {
				if(num%j==0)
					sum+=j;
			}
			
			if(sum != num)
				return "false";
		
		return "true";
	}
	
	
	//Q4a
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	//Q4b
	public static int getNumOf(int len,int [] array) {
		int cnt=0;
		for (int i = 0; i < len; i++) {
			if(sumOfDigits(array[i])==10)
				cnt++;
		}
		return cnt;
	}
	
	//Q5
	public static void printRhombus(int num, char a) {
		
			for(int i=num; i>0; i--) {
				for(int j=0;j<i;j++) 
					System.out.print(a);
				
				for(int j=0;j<num-i;j++) 
					System.out.print("  ");
				
				for(int j=0;j<i;j++) 
					System.out.print(a);
				System.out.println("");
			}
			
			for(int i=2; i<=num; i++) {
				for(int j=0;j<i;j++) 
					System.out.print(a);
				
				for(int j=0;j<num-i;j++) 
					System.out.print("  ");
				
				for(int j=0;j<i;j++) 
					System.out.print(a);
				System.out.println("");
			}	
	}

	
	public static String isSquares(int[][] arr) {
		
		int sumCol,sumRow;
		for (int i = 0; i < arr.length; i++) {
			sumRow=0;
			sumCol=0;
			for (int j = 0; j < arr.length; j++) {
				sumRow+=arr[i][j];
				sumCol+=arr[j][i];
			}
			if(sumCol!=sumRow)
				return "false";
		}
		return "true";
	}
	
	
	//	Q7
	public static String isMirror(int[][] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=arr[0].length/2; j++) {
				System.out.println(arr[i][j]+","+arr[i][arr[i].length-1-j]);
				
				if(arr[i][j]!=arr[i][arr[i].length-1-j]) {
					return "false";
				}
			}
		}
		return "true";
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Q1
//		System.out.print("Enter a number:");
//		int num=scanner.nextInt();
//		System.out.println(bigger(num));
		
		
		//Q2
//		System.out.println("Enter 2 numbers:");
//		int num1=scanner.nextInt();
//		int num2=scanner.nextInt();
//		System.out.println(newNum(num1,num2));
		

		//Q3
//		System.out.print("Enter a number:");
//		int num=scanner.nextInt();
//		System.out.println(isWeighted(num));
		
		//Q4a
//		System.out.print("Enter a number:");
//		int num=scanner.nextInt();
//		System.out.println(sumOfDigits(num));
		
		//Q4b
//		int[] arr= {235,55,22222};
//		System.out.println(getNumOf(arr.length,arr));
		
		
		//Q5
//		printRhombus(4, '#');
		
		
		//Q6
//		int[][] arr = {{2,1,5},{6,7,3},{0,8,1}};
//		System.out.println(isSquares(arr));
		
		
		//Q7
		int[][] arr = {{2, 1, 5, 1, 2},{6, 7, 3, 7, 6},{0, 8, 0, 8, 1}};
		System.out.println(isMirror(arr));
		
		
		
		
		
		scanner.close();
	}

}
