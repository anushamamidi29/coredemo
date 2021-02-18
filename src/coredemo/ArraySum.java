package coredemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements in an array");
	    n=sc.nextInt();
	    int []a= new int[n];
	    // entering elements using for loop
	    System.out.println("Enter the elemnets:");
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    	
	    	sum=sum+a[i];
	    }
	    System.out.println("a="+ Arrays.toString(a));
	    System.out.println("sum:"+sum);
	    sc.close();
	}

}
