/*
Q41. Write a program in java to to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
	
Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1

*/
public class ARRQ41{
	public static void main(String[]args){
		int a[]={1,2,-1,1,2};
		int large=0;
		boolean b=false;
		System.out.print("The given array is : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
		System.out.println("Next Bigger Elements are:");
		for(int i=0;i<a.length;i++){
			int next =-1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					next=a[j];
					break;
				}
			}
			System.out.println("Next bigger element of "+a[i]+" in the arrayis :"+next);
		}
		
		
	}
}