//Print all prime numbers between 1 and 100.
import java.util.Scanner;
public class PrintPrimeNum{
	public static void main(String[]args){
	System.out.println("prime numbers between 1 and 100.");
	int n=100;
	for(int num=1;num<=n;num++){
		int count=0;
		for(int i=1;i<=n;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.print(num+" ");
		}
	}
	
	}
}