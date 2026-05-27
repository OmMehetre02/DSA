//70 Find smallest element in matrix LC 378



import java.util.*;
 public class Day03_70{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
		 
			for(int j=0;j<a[i].length;j++){
			  if(a[i][j]<min){
			    min=a[i][j];
			  }
				
				}
				
			}
			System.out.println("smallest element is = "+min);
			
		
	}
}