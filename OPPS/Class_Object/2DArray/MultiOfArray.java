//maltiplication of two matrix;
import java.util.*;
public class MultiOfArray{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int c[][]=new int [3][3];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.print("Display the First Array :\n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Display the Second Array :\n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Two matrix multiplication result : \n");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
			{
				int sum=0;
				for(int k=0;k<a[i].length;k++){
					sum=sum+a[i][k]*a[k][j];
				}
				c[i][j]=sum;
				
				
			}
		}
			for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
