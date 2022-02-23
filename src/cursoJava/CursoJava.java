package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class CursoJava {
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with value raudis: ");
		double raudis = sc.nextDouble();
		
		double c = circumference(raudis);
		
		double v = volume(raudis);
		
		System.out.printf("Circumference:  %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		
		
		
		
		sc.close();
	}
		public static double circumference(double raudis) {
			return 2.0 * PI * raudis;
		}
		public static double volume(double raudis) {
			return 4.0 * PI * raudis * raudis * raudis  / 3.0 ;
		}
	
}
