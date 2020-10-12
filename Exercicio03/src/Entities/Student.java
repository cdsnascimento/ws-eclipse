package Entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double calcFinalGrade(){
		
		return grade1 + grade2 + grade3;
		
	}
	
	public String result() {
		
		if ( calcFinalGrade() >= 60.00 ) {
			
			return "PASSED";
			
		} else {
			
			return "FAILED";
			
		}
		
	}
	
	public String toString() {
		
		return "MISSING "
				+ String.format("%.2f", 60.00 - calcFinalGrade())
				+ " POINTS";
		
	}

}
