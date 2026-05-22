//69 Find largest element in matrix




import java.util.*;
 public class Day03_69{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
		 
			for(int j=0;j<a[i].length;j++){
			  if(a[i][j]>max){
			    max=a[i][j];
			  }
				
				}
				
			}
			System.out.println("largest element is = "+max);
			
		
	}
}