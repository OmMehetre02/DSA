import java.util.*;
public class Diff{
    public static void main(String [] args )
	{
		Scanner sc = new Scanner (System.in);
		int size=sc.nextInt();
		int a[]= new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sub = 0;
		int max = 0;
		int j=0;	
		
		for(j=0;j<a.length-1;j++)
		{
			
			sub = a[j+1]-a[j];
			if(sub>max)
			{
				max=sub;
			}
				
		}
		System.out.print(max);
	}
}
