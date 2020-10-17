package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numShapes;
		char typeShape;
		Color color;
		Double width;
		Double height;
		Double radius;
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		numShapes = sc.nextInt();
		
		for (int i = 1; i <= numShapes; i++) {
			
			System.out.printf("Shape #%d data:", i);
			System.out.println();
			
			System.out.print("Rectangle or Circle (r/c)? ");
			typeShape = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			color = Color.valueOf(sc.next());
			
			switch (typeShape) {
			
				case 'r':
					System.out.print("Width: ");
					width = sc.nextDouble();
					
					System.out.print("Height: ");
					height = sc.nextDouble();
					
					Shape rec = new Rectangle(color, width, height);
					shape.add(rec);
					
					break;
				case 'c':
					System.out.print("Radius: ");
					radius = sc.nextDouble();
					
					Shape cir = new Circle(color, radius);
					shape.add(cir);
					
					break;
			
			}
					
			System.out.println();
			
		}
		
		System.out.println("SHAPES AREAS:");
		
		for (Shape s : shape) {
			
			System.out.printf("%.2f%n",s.area());
			
		}
		
		sc.close();

	}

}
