//80 Count even and odd numbers in matrix


import java.util.*;
 public class Day04_80{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		
		System.out.print("Enter The First Array = ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
			
		}
		int  evenCount =0;
		int oddCount =0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			if(a[i][j]%2==0){
				 evenCount++;
				
				}
				else{
					oddCount++;
				
					
				}
			}
			
		}
		System.out.print("Count even numbers in matrix is = "+evenCount);
		System.out.print("\nCount odd numbers in matrix is = "+oddCount);
	}
}