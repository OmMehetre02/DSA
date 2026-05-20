//68 Find column sum

import java.util.*;
 public class Day03_68{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		//column sum
		for(int j=0;j<a[0].length;j++){
		   int sum=0;
		    for(int i=0;i<a.length;i++){
			  
			  sum+=a[i][j];
				
				}
				System.out.println("column = "+(j+1)+"  "+"sum = "+sum);
			}
			
		
	}
}