// HAPPY NUMBER

// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false

public class HNum{
	public static void main(String args[]){
		int num=19;
		
		while(num!=1&&num!=4)
		{
			int sumDigitSquare=0;
		while(num>0)
		{
			int digit=num%10;//9,1
			
			int digitSquare=digit*digit;//81
			
		   	sumDigitSquare=sumDigitSquare+digitSquare;
			
		     num=num/10;
			
		}
				num=sumDigitSquare;
		}
		if(num==1){
			System.out.print("Happy Number");
		}else{
			System.out.print("Not Happy Number");
		}
	}
}