package coredemo;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
for(int i=1;i<=n;i++) {
	sum +=i;
}

		System.out.println("The sum of series is:"+ sum);
		s.close();
		}

}
