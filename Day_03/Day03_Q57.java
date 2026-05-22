//57 Recursive binary search 
import java.util.*;
 public class Day03_Q57{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Array size = ");
	   int size=sc.nextInt();
	   int a[]=new int [size];
	   for(int i=0;i<a.length;i++){
	     a[i]=sc.nextInt();
	   }
	   System.out.print("Enter Search Key = ");
	   int target=sc.nextInt();
	    
	     System.out.print(binarySearch (a,0,a.length-1,target));
	   
	  
    }
	public static int binarySearch(int a[],int low,int high,int target){
		
		if(low>high){
			return -1;
		}
		int mid=(low+high)/2;
		  if(a[mid]==target){
			  return mid;
		  }
        if(a[mid]>target){
			return binarySearch(a,low,mid-1,target);
		}		
		return binarySearch(a,mid+1,high,target);
	}
}