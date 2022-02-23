package util;

public class Calculator {

	public static final double PI = 3.14159;

	public static double circumference(double raudis) {
		return 2.0 * PI * raudis;
	}

	public static double volume(double raudis) {
		return 4.0 * PI * raudis * raudis * raudis / 3.0;
	}

}
