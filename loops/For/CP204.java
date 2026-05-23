//Count Primes
public class CP204
{
	public static void main(String args[])
	{
		int n=5000000;
		int numcount=0;
		for(int num=1;num<=n;num++){
			 int count =0;
			for(int i=1;i<=num;i++){
				if(num%i==0){
					count++;
				}
			}if(count==2){
				numcount++;
			}
			
			
		}
		System.out.print(numcount);
		
	}
	
 
}