package tr.org.linux.kamp.triangle;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	int count=input.nextInt();
	
	for(int j=count;j>0;j--){
		for(int i=count;i>0;i--)
			System.out.print(i);

		for(int k=2;k<=count;k++)
			System.out.print(k);
		
		count--;
		System.out.println();
		}
		
	}
	
}

