package ControlFlow;

import java.util.Scanner;

public class ifelsetask {

	public static void main(String[] args) {
		// students name 5 subject marks using user input find total avg and grade
		
		int sub;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.next();
		
		
		
		System.out.println("Enter the marks of 5 sbject");
		System.out.println("sbject 1 :");
		int sub1 = sc.nextInt();
		System.out.println("sbject 2 :");
		int sub2 = sc.nextInt();
		System.out.println("sbject 3 :");
		int sub3 = sc.nextInt();
		System.out.println("sbject 4 :");
		int sub4 = sc.nextInt();
		System.out.println("sbject 5 :");
		int sub5 = sc.nextInt();
		
		
		int totalmarks = sub1+sub2+sub3+sub4+sub5;
		
		int avg = totalmarks/5;
		
		char grade = 0;
		
		if(avg >= 90) {
		grade = 'A';
		}
		else if(avg >= 70) {
			grade ='B';
		}
		else if(avg >= 50) {
			grade ='c';
		}
		else if(avg >= 20) {
			grade ='F';
		}
		
		
		System.out.println("Student name: "+ name);
		System.out.println("Student Marks: "+ totalmarks);
		System.out.println("Student Avarage: "+ avg);
		System.out.println("Student Grade: "+grade);
		
	}

}

