
//141 Rotate matrix 90 degrees 

import java.util.*;

public class Day08_141
{
	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		
	     int a[][]=new int [3][3];
		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a[i].length;j++){
				 a[i][j]=sc.nextInt();
			 }
		 }
		 		 for(int i=0;i<a.length;i++){
			 for(int j=i;j<a[i].length;j++){
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			 }
		 }
		  for(int i=0;i<a.length;i++){
			int start=0;int end=a.length-1;
			while(start<end){
				int temp=a[i][start];
				a[i][start]=a[i][end];
				a[i][end]=temp;
				start++;
				end--;
			}
		  }
		 	 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
     
	   
	}
}