/*
Q6. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5
*/

import java.util.*;
public class fuRec2Q6{
	public static void main(String args [] ){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		Printnum(num);
	}
	public static void Printnum(int n){
		
		if(n==0){
			return;
		}
		Printnum(n-1);
		System.out.print(n+" ");
	}
}
