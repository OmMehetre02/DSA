/*
Q8. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.


Example: Input: N = 4	Output: 10
*/
import java.util.*;
public class FunRecQ8{
	static int sum =0;
	public static void main(String args [])
	{
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		naNumAdd(num);
		System.out.print(sum);
	}
	static void naNumAdd(int n){
		
		if(n==0){
			return ;
		}
		sum=sum+n;
		
		naNumAdd(n-1);
		
	}
}