package tr.org.linux.kamp.fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int count=input.nextInt();
	
		for(int i=0;i<=count;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else
				System.out.println();
		}
	}
}
