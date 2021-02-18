package coredemo;

import java.util.Scanner;

public class Reversepyramid {

	public static void main(String[] args) {
		int i,j,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=s.nextInt();
		for (i=n;i<=n;i--) {
			for(j=i;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
