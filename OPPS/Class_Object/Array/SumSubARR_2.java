//Example: suppose we have one array with size n and find the target sum of sub arrays of size k.
//Second method
//Sliding window example
public class SumSubARR_2{
	public static void main(String []args ){
		int a[]={1,2,3,1,2};
		int target=3,k=2,count=0,sum=0;
		
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		}
		if(sum==target){
			++count;
		}
		for(int i=k;i<a.length;i++){
			sum=sum+a[i]-a[i-k];
		}
		if(sum==target){
			++count;
		}
		System.out.print ("Total sub array sum equal with target "+count);
	}
}