/*
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/

public class ARRQ29{
	public static void main(String[]args){
		int a[]={1,2,3,4,5,6};
		int b[]=new int[a.length];
		int evenIndex=0;
		int oddIndex=1;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				b[evenIndex]=a[i];
				evenIndex=evenIndex+2;
			}else{
				b[oddIndex]=a[i];
				oddIndex=oddIndex+2;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}