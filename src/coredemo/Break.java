package coredemo;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int n;
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
for(int i=1;i<=n;i++) {
	if(i==5) {
		break;
	}
	System.out.println("The number series :"+i);
}
	s.close();
	}

}
