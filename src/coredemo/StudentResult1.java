package coredemo;

import java.util.Scanner;

public class StudentResult1 {

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
		 System.out.println("Student Name :"+name);
		 System.out.println("Rollnumber :" +rollno);
		 if(sub1>=35 && sub2 >=35 && sub3 >=35 && sub4 >= 35 && sub5 >= 35)
		 {
			
			 System.out.println("Result:Pass");
		 }
		 
		 else {
			 System.out.println("Result :fail");
		 }
		s.close();
	}

}