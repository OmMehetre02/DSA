//Q15. Write a java program swap two numbers without using a third variable. 
public class Swapwithout3var{
	public static void main(String[]args){
		int x = 10;
		int y = 20;
		System.out.println("Before swapping:");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		    x = x + y;
		    y = x - y;
			x = x - y;
		
       System.out.println("after swapping:");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
	}
	
	
	
}