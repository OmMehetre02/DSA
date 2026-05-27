//62 Subtract two matrices —



import java.util.*;
 public class Day04_62{
 
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	    int a[][]=new int[3][3];
		int b[][]=new int[3][3];
        int sub[][]=new int[3][3];
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
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		
		for(int i=0;i<sub.length;i++){
			for(int j=0;j<sub[i].length;j++){
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}