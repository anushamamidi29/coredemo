package coredemo;

import java.util.Scanner;

public class SumPositiveNumber {

	public static void main(String[] args) {
		int sum = 0;
	    int number = 0;
	 
	     Scanner input = new Scanner(System.in);
	     //do-while loop continues until the num is positive
	     do {
	    	 // add only positive numbers
	    	 sum +=number;
	    	 System.out.println("Enter the number");
	    	 number=input.nextInt();
	         }while(number>=0);
	     
	    	 System.out.println("sum ="+sum);
	     input.close();

	}

}
