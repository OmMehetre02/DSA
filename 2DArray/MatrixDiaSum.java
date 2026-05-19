// Example: WAP to create 3 x 3 matrix and calculate sum of left and right diagonal 

import java.util.*;
public class MatrixDiaSum{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int [3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		int rightD=0,leftD=0;
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
				if(i==j){
					rightD=rightD+a[i][j];
					
				}
				if(j==2-i){
					leftD=leftD+a[i][j];
					
				}
			}
			System.out.println();
		}
		System.out.print("right side diagonal sum is = "+rightD);
		System.out.print("leftDside diagonalsum is = "+leftD);
	}
}
