//66 Print boundary elements;



import java.util.*;
 public class Day03_66{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			if(i==0 || j==0 || i==a.length-1 || j==a[i].length-1){
				System.out.print(a[i][j]+" ");
				}
			}
			
		}
	}
}