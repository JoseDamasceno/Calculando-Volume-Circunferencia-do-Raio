package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class CursoJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with value raudis: ");
		double raudis = sc.nextDouble();
		
		double c = Calculator.circumference(raudis);
		
		double v = Calculator.volume(raudis);
		
		System.out.printf("Circumference:  %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		
		
		
		
		sc.close();
	}
}
