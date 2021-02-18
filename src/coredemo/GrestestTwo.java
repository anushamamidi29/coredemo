package coredemo;

import java.util.Scanner;

public class GrestestTwo {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b) {
			System.out.println(a+" is greatest");
		}
		else {
			System.out.println(b+" is Greatest");
		}
		s.close();
		
	}
	
}
