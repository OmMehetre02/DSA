


import java.util.*;
public class XHEIGH
{
public static void main(String []args)
{
	System.out.println("Enter The Array Size");
		Scanner sc = new Scanner (System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		/* int largest=0;
		int secondLargest=0;
		int thirdLargest=0;
		int forth=0; */
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					    a[i]=a[j];
						a[j]=temp;
				}
			}
					
			
		}
		int max=a[a.length-1];
		System.out.println("Enter kth Highest element");
		int kth=sc.nextInt();
	    int count=0;
		for(int j=a.length-1;j>0;j--)
		{
			if(a[j]>a[j-1])
			{
				count++;
			}
			if(count==kth)
			{
				System.out.println(kth+" Highest element"+a[j]);
				break;
			}
		}
		
}
}