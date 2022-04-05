package javabootcamp.basic.ex5;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//Q1	
//	int	arr1[]= {1,2,3,4,5};
//	int	arr2[]= {5,4,3,2,1};
//	int reversed=0,notReversed=0;
//	for (int i = 0; i < arr1.length; i++) {
//		if((arr1[i]!=arr2[arr1.length-1-i])&&(arr1[i]!=arr2[i])) {
//			System.out.println("The arrays are different");
//			break;
//		}
//		if(arr1[i]==arr2[arr1.length-1-i])
//			reversed++;
//		if(arr1[i]==arr2[i])
//			notReversed++;
//	}
//	
//	if(reversed==arr1.length)
//		System.out.println("The collections are reversed");
//	if(notReversed==arr1.length)
//		System.out.println("The collections are not reversed");
	
	
	//Q3
//		int	array[]= new int[10];
//		
//		System.out.println("Enter 2 numbers");
//		array[0]=scanner.nextInt();
//		array[1]=scanner.nextInt();
//		
//		System.out.print(array[0]+","+array[1]+",");
//		for(int i =2;i<array.length;i++) {
//			array[i]=array[i-1]+array[i-2];
//			System.out.print(array[i]+",");
//		}
		
		
	//Q5
//		
//		int	arr1[]= {1,2,3,4,5};
//		int	arr2[]= {5,1,2,3,4};
//		int cnt=0;
//		for (int i = 0; i < arr2.length-1; i++) {
//			if(arr1[i]!=arr2[i+1]) {
//				System.out.println("fals");
//				break;
//			}
//				
//			else
//				cnt++;
//		}
//		
//		if(cnt==arr2.length-1)
//			if(arr1[arr2.length-1]==arr2[0])
//				System.out.println("true");
		
	
	//Q7
//		
//		int	arr1[]= new int[5];
//		int	arr2[]= new int[5];
//		int	arr3[]= new int[5];
//		int index=0;
//		
//		System.out.println("Enter 5 values for the first array");
//		for(int i = 0; i < arr1.length; i++)
//			arr1[i]=scanner.nextInt();
//		
//		System.out.println("Insert 5 values into the second array");
//		for(int i = 0; i < arr2.length; i++)
//			arr2[i]=scanner.nextInt();
//		
//		for(int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if(arr1[i]==arr2[j]) {
//					arr3[index]=arr1[i];
//					index++;
//					break;
//				}
//			}
//		}
//			
//		for(int i = 0; i < index; i++)
//			System.out.print(arr3[i]+",");
//		System.out.println("");
//		System.out.println(index+1);
//		
		
	//Q9
		
//		int	arr1[]= new int[3];
//		int	arr2[]= new int[3];
//		int sum1=0,sum2=0;
//		int temp1,temp2;
//		int cnt=0;
//		
//		
//		System.out.println("Enter 3 values for the first array");
//		for(int i = 0; i < arr1.length; i++)
//			arr1[i]=scanner.nextInt();
//		
//		System.out.println("Insert 3 values into the second array");
//		for(int i = 0; i < arr2.length; i++)
//			arr2[i]=scanner.nextInt();
//		
//		
//		for(int i = 0; i < arr1.length; i++) {
//			temp1=arr1[i];
//			temp2=arr2[i];
//			while(temp1!=0||temp2!=0) {
//				sum1+=temp1%10;
//				temp1/=10;
//				sum2+=temp2%10;
//				temp2/=10;
//			}
//			if(sum1==sum2)
//				cnt++;
//		}
//		if(cnt==arr1.length)
//			System.out.println("The collections are compatible");
//		else
//			System.out.println("The collections are not compatible");
//			
	
	//Q11
//		int max=0;
//		int	arr[][]= new int[10][10];
//		System.out.print("Enter rows: ");
//		int row=scanner.nextInt();
//		while(row>10||row<1) {
//			System.out.print("Enter a number between 1 to 10");
//			row=scanner.nextInt();
//		}
//		
//		System.out.print("Enter columns: ");
//		int col=scanner.nextInt();
//		while(col>10||col<1) {
//			System.out.print("Enter a number between 1 to 10");
//			col=scanner.nextInt();
//		}
//		
//		System.out.println("Enter "+(row*col)+" numbers");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				arr[i][j]=scanner.nextInt();
//				if(arr[i][j]>max)
//					max=arr[i][j];
//			}
//		}
//		
//		
//		System.out.println("The matrix is: ");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("The max is: "+max);
		
		
		
		//Q15
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
