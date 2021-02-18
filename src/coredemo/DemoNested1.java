package coredemo;

import java.util.Scanner;

public class DemoNested1 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for (i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(1);
			}
			System.out.println();
		}


	}

}
