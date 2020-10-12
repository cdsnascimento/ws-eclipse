package applicaation;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the number of rows: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();
		
		
		int [][] mat = new int[m][n];
	
		System.out.println("Enter with the values of the matrix: ");
		
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("");
		
		System.out.println("============================");
	
		System.out.println("");
		
		for ( int i = 0; i < mat.length; i++ ) {
			
			for ( int j = 0; j < mat[i].length; j++ ) {
				
				System.out.print(mat[i][j] + " ");
				 
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("============================");
	
		System.out.println("");
		
		System.out.print("Enter the matrix number: ");
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				if ( mat[i][j] == x ) {
					
					System.out.printf("Position: %d, %d", i, j);
					System.out.println("");
					
					if (i > 0 ) {
						
						System.out.printf("Up: %d%n", mat[i - 1][j]);
						
					}
					
					if (j > 0) {
						
						System.out.printf("Left: %d%n", mat[i][j - 1]);
						
					}
					
					if (j + 1 < mat[i].length) {
						
						System.out.printf("Right: %d%n", mat[i][j + 1]);
						
					}
					
					if (i + 1 < mat.length) {
						
						System.out.printf("Down: %d%n", mat[i + 1][j]);	
						
					}
					
					
				}
				
			}
			
		}
		
		
		sc.close();

	}
}
