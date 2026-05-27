/*

3024. Type of Triangle
Easy
Topics
premium lock icon
Companies
Hint
You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

A triangle is called equilateral if it has all sides of equal length.
A triangle is called isosceles if it has exactly two sides of equal length.
A triangle is called scalene if all its sides are of different lengths.
Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle
Example 1:

Input: nums = [3,3,3]
Output: "equilateral"
Explanation: Since all the sides are of equal length, therefore, it will form an equilateral triangle.
*/
public class Leet3024
{
	public static void main (String []args)
	{
		int a[]={40,2,3};
		int x=a[0];
		int y=a[1];
		int z=a[2];
		
	   if(x+y>z&&y+z>x&&z+x>y)
	   {
			 if(x==y&&y==z&&x==z)
			 {
				System.out.print("equilateral triangle.");
			}else if(x==y||y==z||x==z)
			{
				System.out.print("isosceles Triangle");
			}else
			{
				System.out.print("scalene  Triangle");
			}
		
	   }
	   else
	   {
		   System.out.print("Not Valid Triangle");
	   }
		
	}
}