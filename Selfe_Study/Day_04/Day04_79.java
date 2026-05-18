//79 Interchange columns of matrix —

import java.util.Scanner;
public class Day04_79{
   public static void main(String args[]){
     
	 Scanner sc = new Scanner (System.in);
	  
	  int a[][]=new int[3][3];
	  
	  for(int i=0;i<a.length;i++){
	  
     	  for(int j=0;j<a[i].length;j++){
	
			 a[i][j]=sc.nextInt();
		  } 
	  }
	    int n = a.length;
        int m = a[0].length;
		  for(int i=0;i<n;i++){
		     int temp=a[i][0];
			   a[i][0]=a[i][m-1];
			     a[i][m-1]=temp;
		}
		
		
		for(int i=0;i<a.length;i++){
	  
     	    for(int j=0;j<a[i].length;j++){
		  
		        System.out.print(a[i][j]+" ");
		    }
        		 System.out.println(); 
		}
   }
}