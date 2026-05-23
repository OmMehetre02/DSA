/*  //Harshad Number
 
 // Example 1:

// Input: x = 18

// Output: 9

// Explanation:

// The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.

// Example 2:

// Input: x = 23

// Output: -1 */


public class Harshednum
{
	public static void main(String args[])
	{
		int num=23;
		int orignailNum=num;
		int digitSum=0;
		
		while(num>0)
		{
			int digit=num%10;
             digitSum+=digit;
              num=num/10;
			  
		}
		if(orignailNum%digitSum==0){
			System.out.print("This Is Harshed number ="+digitSum);
		}else{
			System.out.print("This Is Not Harshed number ="+"-1");
		}
	}
}