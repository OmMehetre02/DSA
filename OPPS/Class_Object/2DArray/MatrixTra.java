//matrix 3x3 transfrom

import java.util.*;
public class MatrixTra{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Display The given Matrix : \n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a[i].length;j++){
				
				int temp=a[i][j];
				  a[i][j]=a[j][i];
				  a[j][i]=temp;
			}
			
		}
		System.out.print("Display The given Matrix After transfrom: \n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}