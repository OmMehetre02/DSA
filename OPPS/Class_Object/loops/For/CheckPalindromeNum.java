
//Check whether the number is palindrome or not.
   import java.util.Scanner;
   public class CheckPalindromeNum{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Check whether the number is palindrome or not.");
	int num = sc.nextInt();
		int	reverse = 0;
		
		int originalNum = num;
		for(;num!=0;num/=10){
			int lastdigit=num%10;
		
			reverse= reverse*10+lastdigit;
		}
			
			if(originalNum==reverse){
				System.out.println("The number is palindrome :- "+ originalNum);
			}
	       else{
			   	System.out.println("The number is not palindrome :-"+originalNum);
		   }
		
			
		
	}
  }

