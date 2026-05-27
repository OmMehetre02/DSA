// Example: suppose we have one array with size n and find the target sum of sub arrays of size k.


public class SumSubARR{
	public static void main (String args []){
		int a[]={1,2,3,1,2};
		int k=2,target=3,count=0,i,j;
		for(i=0;i<=(a.length-k);i++){
			int sum=0;
			for(j=i;j<(i+k);j++){
				sum=sum+a[j];	
			}
			System.out.printf("{%d,%d} = %d \n",a[i],a[j-1],sum);
			if(target==sum){
				count++;
			}
		}
		System.out.print ("Total sub array sum equal with target "+count);
		
	}
}