package lab1;

/**
 * Starter class for Lab Assignment 1 (Fall 2026).
 *
 * The program converts a temperature from Celsius to Fahrenheit.
 * Expected output for 25 C: 77.0
 */
public class Main {

	public static void main(String[] args) {
		double celsius=25.0;
		double Fahrenheit= celsiusToFahrenheit(celsius);
		
		System.out.println("celsius: "+ celsius);
		System.out.println("Fahrenheit: " + Fahrenheit(25));
	}

	/** Converts degrees Celsius to degrees Fahrenheit. */
	public static double celsiusToFahrenheit(double c) {
		return (celsius * 9.0 /5.0  )+ 32.0;
		System.out.println("202311370");
	}
}
