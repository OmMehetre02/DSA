import java.util.*;
public class Kth_min
{
public static void main(String []args)
{
	System.out.println("Enter The Array Size");
		Scanner sc = new Scanner (System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					    a[i]=a[j];
						a[j]=temp;
				}
			}
					
			
		}
		System.out.println();
		int min=0;
		System.out.println("Enter Kth min element");
		int kth=sc.nextInt();
	    int count=0;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1])
			{
				count++;
			}
			if(count==kth)
			{
				System.out.println(kth+" min element"+a[j]);
				break;
			}
		}
		
}
}