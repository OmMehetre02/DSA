//72 Check symmetric matrix 

import java.util.*;
 public class Day04_72{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		boolean isSymmetric=true;
		for(int i=0;i<a.length;i++){
		 
			for(int j=0;j<a[i].length;j++){
			  if(a[i][j]!=a[j][i]){
			    isSymmetric=false;
			  }
			  
				
				}
				
			}
			if( isSymmetric){
				System.out.print("is symmetric matrix ......");
			}else{
				System.out.print("is Not symmetric matrix ......");
			}
			
		
	}
}