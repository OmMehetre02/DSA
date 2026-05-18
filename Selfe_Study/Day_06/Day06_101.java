//101 Rotate array left


import java.util.Scanner;
public class Day06_101{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	    int  a[]={1,2,3,4,5,6,7};
		int k=3;
		for(int i=0;i<k;i++){
			int first =a[0];
			for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		
		
		for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
		}		 
		 
		 
   }
}