package coredemo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2 == 0) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
		s.close();
	}

}
