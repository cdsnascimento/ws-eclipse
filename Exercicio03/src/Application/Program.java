package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Student Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("");
		System.out.printf("FINAL GRADE: %.2f%n", student.calcFinalGrade());
		
		System.out.printf("RESULT: %s%n", student.result());
		
		if ( student.result() == "FAILED") {
			
			System.out.println(student);
		
		}
				
		sc.close();
		
	}

}
