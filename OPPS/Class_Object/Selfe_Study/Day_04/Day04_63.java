//63 Multiply two matrices


import java.util.*;
 public class Day04_63{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		int b[][]=new int[3][3];
        int mul[][]=new int[3][3];
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
				for(int k=0;k<b.length;k++){
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i=0;i<mul.length;i++){
			for(int j=0;j<mul[i].length;j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println("\t");
		}
		
	}
}