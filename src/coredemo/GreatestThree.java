package coredemo;

import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
	    c=scan.nextInt();
	    if(a>b && a>c) {
	    	System.out.println("a is greatest");
	    }
	    else if(c>b && c>b) {
	    	System.out.println("c is greatest");
	    }
	    else {
	    	System.out.println("b is greatest");
	    }
		
scan.close();
	}

}
