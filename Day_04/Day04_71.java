//71 Check identity matrix 

import java.util.*;
 public class Day04_71{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		boolean isIdentity=true;
		for(int i=0;i<a.length;i++){
		 
			for(int j=0;j<a[i].length;j++){
			  if(i==j&&a[i][j]!=1){
			    isIdentity=false;
			  }
			  else if(i!=j&&a[i][j]!=0){
				    isIdentity=false;
			  }
				
				}
				
			}
			if( isIdentity){
				System.out.print("is identity matrix ......");
			}else{
				System.out.print("is Not identity matrix ......");
			}
			
		
	}
}