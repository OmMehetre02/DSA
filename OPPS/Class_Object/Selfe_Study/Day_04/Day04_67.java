
//67 Find row sum;


import java.util.*;
 public class Day03_67{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<a.length;i++){
		 int sum=0;
			for(int j=0;j<a[i].length;j++){
			  
			  sum+=a[i][j];
				
				}
				System.out.println("row = "+(i+1)+"  "+"sum = "+sum);
			}
			
		
	}
}