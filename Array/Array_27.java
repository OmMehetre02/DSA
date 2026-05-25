/*
Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
 */
 import java.util.Scanner ;
 public class Array_27{
	 public static void main(String []args){
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter The Array Size");
		 int size=sc.nextInt();
		 int a[]=new int [size];
		 int i;
		
		 System.out.println("Enter The Array Elements");
		 for(i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
		 }
		 System.out.print("Output:- [");
		 for(i=0;i<a.length;i++){
			 if(i==0){
				 System.out.print("0"+" ");
			 }else if(i==a.length-1){
				 System.out.print("0"+" ");
			 }else{
				 System.out.print(a[i]+" ");
			 }
		 }
		 System.out.print("]");
	 }
 }