
//Example: WAP to create 3x 3 matrix and find the row which contain maximum value in matrix 

import java.util.*;
public class MaximumRowValue{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int [3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int max=a[0][0],rowindex=-1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]>max){
					rowindex=i;
					max=a[i][j];
				}
				
			 }
			System.out.println();
		}
	   System.out.print("----------------------------------------------------------");
	    if(rowindex!=-1){

       System.out.print(a[rowindex][0]+a[rowindex][1]+a[rowindex][2]);
	}
	 else{
		 System.out.println("No max value in matrix");
	 }

	}
}