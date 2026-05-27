// Rows Additon in Matrix


import java.util.*;
public class MatrixRowsAdd{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++){
			int sum=0;
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.print("---"+sum+"\n");
		}
		
		
		
	}
}