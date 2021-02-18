package coredemo;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		char  c=s.next().charAt(0);
		if(c=='a'|| c=='A' || c=='e'|| c=='E' || c=='i' || c=='I' || c=='o'|| c=='O'|| c=='u'|| c=='U' ) {

			System.out.println("the entered char is vowel");
	}
		else {
			System.out.println("the entered char is not vowel");
		}
s.close();
}
	
}
