//pattern
public class HelloInvertedHalfPyramidN{
 public static void main(String[]args){
	 for(int i = 1;i<=5;i++)  {
			for(int j = 1; j<=5;j++) 
			{
				
				String res= (i==1)?(j+" "):(j==1)?(i+" "):(j==6-i)?("5"):
				"  ";
						System.out.print(res);
				
				/*	if(i==1) {
						System.out.print(j+" ");
					}
					else if(j==1)
					{
					  System.out.print(i+" ");	
					}
					else if(j==6-i)
					{
						System.out.print(5+" ");
					}
					else{
					System.out.print("  ");
					}
					*/

			}
			System.out.println();
		}
	}
}