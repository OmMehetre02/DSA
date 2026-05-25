/*
Q9.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.Scanner;
public class ARRPR24{
	public static void main(String []args){
		System.out.println("Enter The Array Size");
		Scanner sc = new Scanner (System.in); 
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length];
		int eI=0;
		int oI=1;
		System.out.println("Enter The Array Elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Output :- [");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			b[eI]=a[i];
			eI+=2;
			}
			else
			{
				b[oI]=a[i];
				oI+=2;
			}
		}
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	System.out.print(" ] ");
	}
}
