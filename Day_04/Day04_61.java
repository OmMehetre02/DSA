//61 Add two matrices LC 566


import java.util.*;
 public class Day03_61{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		int b[][]=new int[3][3];
        int sum[][]=new int[3][3];
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.print("Enter The Second Array = ");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				sum[i][j]=a[i][j]+a[i][j];
			}
		}
		
		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum[i].length;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}