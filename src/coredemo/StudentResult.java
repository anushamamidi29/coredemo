package coredemo;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		int sub1,sub2,sub3,sub4,sub5 ,total;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name=s.next();
		System.out.println("Enter your rollno");
		String rollno=s.next() ;
		System.out.println("enter the marks of 5 subjects:");
		 sub1=s.nextInt();
		 sub2=s.nextInt();
		 sub3=s.nextInt();
		 sub4=s.nextInt();
		 sub5=s.nextInt();
		 total=sub1+sub2+sub3+sub4+sub5;
		 
		 if(total>400 && total<=500)
		 {
			 System.out.println("Result:Excellent");
		 }
		 else if(total>300 && total <=400)
		 {
			 System.out.println("Result:Good");
		 }
		 else if(total>200 && total <=300){
			 System.out.println("Result :Can do Better");
			  }
		 else {
			 System.out.println("Result :fail");
		 }
		s.close();
	}

}
