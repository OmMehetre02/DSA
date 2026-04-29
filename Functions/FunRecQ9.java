/*
Q9. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.


Example: Input: 4567	 Output: 4
*/
import java.util.*;
    
public class FunRecQ9
{
	static int count=0;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		System.out.print(digitcount(num));
		
	}
	public static int digitcount(int n)
	{
		if(n==0){
			return 0;
		}
		n=n/10;
		count++;
		
		digitcount(n);
		return count;
	}
}