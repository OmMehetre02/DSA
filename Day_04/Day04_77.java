//77 Find sum of diagonal elements

import java.util.*;
 public class Day04_77{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		int liftDiagonalSum =0;
		int rightDiagonalSum =0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			if(i==j){
				liftDiagonalSum+=a[i][j];
				
				}
				if(j==2-i){
					rightDiagonalSum+=a[i][j];
				
					
				}
			}
			
		}
		System.out.print("lift Diagonal Sum is = "+liftDiagonalSum);
		System.out.print("\nright Diagonal Sum is = "+rightDiagonalSum);
	}
}