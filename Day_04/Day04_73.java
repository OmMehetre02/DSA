//73 Check upper triangular matrix 


import java.util.*;
 public class Day04_73{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		boolean isUpperTriangular=true;
		for(int i=0;i<a.length;i++){
		 
			for(int j=0;j<a[i].length;j++){
			  if(i>j&&a[i][j]!=0){
			    isUpperTriangular=false;
			  }
			  
				
				}
				
			}
			if( isUpperTriangular){
				System.out.print("is upper triangular ......");
			}else{
				System.out.print("is Not upper triangular......");
			}
			
		
	}
}