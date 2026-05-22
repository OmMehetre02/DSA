//108 Binary search

import java.util.*;
public class Day06_108{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   System.out.print(" Enter The Array Eleents = ");
	   for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
		  
	   }
	   System.out.print("Enter The Skey = ");
	   int skey=sc.nextInt();
	   int left=0;
	   int right=a.length-1;
	   while(left<=right){
		   int mid=left+(right-left)/2;
		   if(a[mid]==skey){
			   System.out.print("Search key index is "+mid);
			   break;
		   }
		   else if(a[mid]<skey){
			   left=mid+1;
		   }else{
			   right=mid-1;
		   }
	   }
	   
   }
}