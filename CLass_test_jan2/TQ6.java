/*
Q6. Write a java program to merge of two given array. 
Input :- First Array :- 1 2 3 4 5 
         Second Array :-  6 7 8 9 10  
 Output :- 1 10 2 9 3 8 4 7 5 6
 */
 import java.util.Scanner;
public class TQ6{
   public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		int b[]=new int[size];
		int c[]=new int[a.length+b.length];
		System.out.print("Enter The first Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter The second Array Elements = ");
		for(int i=0;i<a.length;i++){
			b[i]=sc.nextInt();
		}
		int L=0;
		int R=b.length;
		for(int i=0,j=a.length;i<a.length;i++,j++){
			 
			 c[i]=a[i];
			  
			  c[j]=b[i];
			 
		}
		
		
		
           for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
  }
}