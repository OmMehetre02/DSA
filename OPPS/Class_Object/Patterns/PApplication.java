/*public class PApplication
{
    public static void main(String x[])
    {
        int i, j;
        int count = 0  ;
        for(i = 1; i <= 5; i++)
        {   
         for(j=1; j <= 9; j++)
            {
              if(j <= 6 - i)
              {
				  System.out.print(++count);  
		     	}
		         else if (j>=4+i) {
				System.out.print(--count);
			     }
                 else
                {
                    System.out.print(" ");
                }
            }
			 count = 0;  
            System.out.println();
        }
    }
}
*/
public class PApplication
{
    public static void main(String []args)
    {
        int i, j;
        

        for(i = 1; i <= 5; i++)
		
        {
			int count = 0;
            for(j=1; j<= 9; j++)
            {
                if((j<=6-i)||(j>=4+i))
                {
                    if(j<=6-i)
							System.out.print(++count);
					else if(j==4+i)
						System.out.print(count);
					else	
						System.out.print(--count);
						
                }
			
                else
                {
                    System.out.print(" ");
                }
            }

           // count = 0; 
            System.out.println();
        }
    }
}
