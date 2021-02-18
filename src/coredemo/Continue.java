package coredemo;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		int n;
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
for(int i=1;i<=n;i++) {
	if(i==5) {
		continue;
	}
	System.out.println(i);
}
	s.close();

	}

}
