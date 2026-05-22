//142 Search element in sorted matrix

import java.util.*;

public class Day08_142
{
	public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		
	     int a[][]=new int [3][3];
		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a[i].length;j++){
				 a[i][j]=sc.nextInt();
			 }
		 }
		 System.out.print("Enter the target ");
		 int target=sc. nextInt();
		 		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a[i].length;j++){
				if(a[i][j]==target){
				System.out.print("Found");
				 break;
				}
				else{
					System.out.print("Not Found");
					break;
				}
			 }
		 }

		 	
	   
	}
}