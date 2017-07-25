package tr.org.linux.kamp.asalsayı;
import java.util.Scanner;



public class AsalSayı{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int count = input.nextInt();
		int loop = 0;
		int num = 2;
		boolean isPrime = true;
		while(loop < count) {
			isPrime = true;
			for(int i = 2 ; i < num ;i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
					
				}
			}
			
			if(isPrime) {
				loop++;
				System.out.print(num + " ");
			}
			num++;
			
		}
				
	}
}


/*
package tr.org.kamp.linux.prime;

import java.util.Scanner;
public class AsalSayı {
	
	public static void main(String[] args) {
		
	
	Scanner input=new Scanner(System.in);
	int count=input.nextInt();
	
	for(int i=1;i<=count;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) break;
			else if(i%j!=0 && j==i-1)
				System.out.println(i);
				
		}
		
	}
}	
}
*/