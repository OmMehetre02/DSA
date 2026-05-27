/*
Q48. Write a java program to print this pattern.

	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1
*/
public class PatternQ48{
	public static void main(String[]args) {
		int n=7,n1=2;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				
				if(i<=4&&j<=i*2-1||i>4&&j<=n-2)
				{
					if(j%2!=0)
					{
						System.out.print(i<=4?(i+" "):(i-n1));
					}
					else
					{
						System.out.print("* ");
						
					}
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
            n=i>4?n-2:n;
			n1=i>4?n1+2:n1;
		}
	}
}