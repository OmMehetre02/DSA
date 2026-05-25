/*
Q43. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	
Expected Output :
		The given array is : 7 9 5 6 13 2
		The elements which provide maximum difference is: 5, 13
		The Maximum difference between two elements in the array is: 8
*/

public class ARRQ43
{
	public static void main(String[]args)
	{
		int a[]={7,5,6,13,2};
		int first= 0;
		int second = 0;
		int max =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
              if(a[j]>a[i])
			    {
				  int diff=a[j]-a[i];
				  if(diff>max)
				   {
				  
				  max =diff;
				  first=a[i];
				  second=a[j];
			       }
			    }
		    }
	    }
	   System.out.println("The given array is:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nThe elements which provide maximum difference is: " + first + ", " + second);
        System.out.println("The Maximum difference between two elements in the array is: " + max);
    }
}