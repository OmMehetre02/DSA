//Find the sum of digits of a number.
   
   import java.util.Scanner;
      public class SumofDigits{
        public static void main (String[]args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Find the sum of digits of a number.");
			int num = sc.nextInt();
			int sum = 0;
			int i = num;
			for(;i!=0;i/=10){
				int digit=i%10;
			sum=sum+digit;
			num = num/10;
			}
			 System.out.println("The sum of the digits is: " + sum);
				
   }
}