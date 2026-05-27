/*Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;
public class ArrayQ12
{
	public static void main(String []args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size");
	 int size = sc.nextInt();
	 int a[]=new int[size];//Array made of size
	 System.out.println("enter Array Element");
	 
	 for(int i=0;i<size-1;i++ ){
		 a[i]=sc.nextInt();
	 }
	 System.out.println("Displaying Array");
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	 System.out.println("Enter index");
	 int k= sc.nextInt();
	 System.out.println("Enter value");
	 int v= sc.nextInt();
	 //logic 
		//shifting 
		for(int i=a.length-1;i>k;i--){
			a[i]=a[i-1];	
		}
		//inserting value at index
		a[k]=v;
		
		//printing element
		System.out.println("Array after insertion");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
}