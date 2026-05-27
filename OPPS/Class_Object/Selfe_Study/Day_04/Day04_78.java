
//80 78 Interchange rows of matrix — 


import java.util.*;
 public class Day04_78{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		  int n = a.length;
        int m = a[0].length;

        // swap first row and last row
        for (int j = 0; j < m; j++) {
          int temp=a[0][j];
		  a[0][j]=a[n-1][j];
		  a[n-1][j]=temp;
        }
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}
}