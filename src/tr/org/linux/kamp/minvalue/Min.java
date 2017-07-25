package tr.org.linux.kamp.minvalue;
import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen aralarına boşluk koyarak iki sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		double result = min(number1, number2);
		
		System.out.println("Küçük sayı: " + result);
		
	}
	
	public static double min(double a, double b) {
		return a>b?b:a;
	}
	
	
	
}
