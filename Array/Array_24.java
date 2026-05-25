/*
Q9.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.*;
public class Array_24{
	public static void main(String []args){
		int arr[] = {1, 2, 3, 4, 5, 6};
		ArrayList <Integer> even = new ArrayList<>();
		ArrayList <Integer> odd = new ArrayList<>();

			for(int i=0;i<arr.length;i++) {
				if(arr[i] %2==0) {
					even.add(arr[i]);
				}
				else {
					odd.add(arr[i]);
				}
			}
			int i =0;
			int j=0;
			int k =0;
			while(i!=arr.length) {
				arr[i++] = even.get(k++);
								arr[i++] = odd.get(j++);

			}
			
			System.out.println(Arrays.toString(arr));
	}
}
