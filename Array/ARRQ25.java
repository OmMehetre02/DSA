/*
Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.Scanner;
public class ARRQ25{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Output :- ");
		int index=0;
		for(int i=0;i<a.length;i++){
			
			if(a[i]!=0){
				a[index]=a[i];
				index++;
				
			}
			
		}
		while(index<a.length){
			a[index]=0;
			index++;
		}
		 for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		} 
	}
}
