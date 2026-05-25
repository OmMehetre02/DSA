/*
Q42. Write a program in java to find a subarray with given sum from the given array?
	
Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
*/
public class ARRQ42{
	public static void main(String [] args){
		
		int a[]={3,4,-7,1,3,3,1,-4};
		int target = 7;

		System.out.print("The given array is : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

		System.out.println("\nSubarrays with sum 7 are:");

		for(int i=0;i<a.length;i++){
			
			int sum=0;

			for(int j=i;j<a.length;j++){
				
				sum = sum + a[j];

				if(sum == target){

					System.out.print("["+i+".."+j+"] -- { ");

					for(int k=i;k<=j;k++){
						System.out.print(a[k]+" ");
					}

					System.out.println("}");
				}
			}
		}
	}
}