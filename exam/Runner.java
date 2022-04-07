package javabootcamp.basic.exam;

import java.util.Iterator;

public class Runner {
	
	//Question 3:
	
	public static int numberOfDigits(int num) {
		int cnt=0;
		while(num!=0) {
			num/=10;
			cnt++;
		}
		return cnt;
	}
	
	public static boolean isPalindrome(int num) {
		int numOfDigit;
		
		while(num>0){
			numOfDigit=numberOfDigits(num);
			if((num%10) !=num/(int)Math.pow(10.0,numOfDigit-1)) 
				return false;
			
			num%=(int)Math.pow(10.0,numOfDigit-1);
			num/=10;
		}
		
		return true;
	}

	
	
	//Question 4:
	public static int numOfArray(int[]array) {
		int sum=0;
		for(int i =0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	public static int[] concetArrays(int[] array1,int[] array2) {
		int sum1=numOfArray(array1);
		int sum2=numOfArray(array2);
		
		// find which sun of array is bigger 
		int[] biggerrArr = array1, smalerArr = array2;
		if (sum1 <sum2) {
			biggerrArr = array2;
			smalerArr = array1;
		}
			
		int newArr[]=new int[biggerrArr.length+smalerArr.length+2];
		
		for(int i =0;i<biggerrArr.length;i++) {
			newArr[i]=biggerrArr[i];
		}
		
		for(int i=0;i<smalerArr.length;i++) {
			newArr[biggerrArr.length+i]=smalerArr[i];
		}
		
		newArr[newArr.length-2]=sum1+sum2;
		newArr[newArr.length-1]=Math.abs(sum1-sum2);
		
		return newArr;
	}
	
	public static void main(String[] args) {
		
		//Question 3:
		System.out.println(isPalindrome(112));
		System.out.println(isPalindrome(112211));
		
		
		
		
		//Question 4:
//		int[] arr1= {7,8,-4};
//		int[] arr2= {-5,7,3,2};
//		int[] newArr=new int[9];
//		newArr=concetArrays(arr1,arr2);
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.print(newArr[i]+",");
//		}
		
		
		
		
		

	}

}
