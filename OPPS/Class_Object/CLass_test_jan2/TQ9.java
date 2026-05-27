/*Q9. You are given an integer array containing zero and non-zero values. Move all zero values to 
the end of the array while maintaining the original order of non-zero elements. 
Description: 
Use two pointers: 
• One pointer tracks the position for next non-zero element.  
• Another pointer scans the array. 
Place non-zero elements first and fill remaining positions with zeros.  
Input: 
arr = [0,1,0,3,12] 
Output: 
[1,3,12,0,0] 
Time Complexity: 
O(n)
*/
import java.util.Scanner;
public class TQ9{
   public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Array size = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			int temp=a.length-1;
			for(int j=0;j<a.length;j++){
				if(a[i]!=0){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
           for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
  }
}