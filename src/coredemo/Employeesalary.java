package coredemo;

import java.util.Scanner;

public class Employeesalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=s.next();
		System.out.println("Enter your id");
		String id=s.next();
		
		System.out.println("Enter your Basic salary");
		int basic=s.nextInt() ;
		System.out.println("Enter your hra");
		int hra=s.nextInt();
		System.out.println("Enter your da");
		
		int  da=s.nextInt();
		System.out.println("Enter your pf");
		int pf=s.nextInt();
		int netsalary=basic+hra+da-pf;
		System.out.println("Name:"+name);
		System.out.println("id:"+ id );
		System.out.println("Netsalary="+netsalary);
		
		s.close();

	}

}
