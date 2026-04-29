/*Q2. Write a java program to display 1 to nth Strong Number. 
Example : A Strong number is a number whose sum of factorial of digits is equal to the 
original number.
*/
public class Q2{
	public static void main(String[]args){
		int n=1000;
		for(int num=1;num<=n;num++){
		int temp=num;
		int sumfact=0;
		
		while(temp>0){
			int digit=temp%10;
			
			int fact=1;
			for(int i=1;i<=digit;i++){
					
					fact=fact*i;
					
			}
				sumfact=sumfact+fact;
				
				temp=temp/10;
			
		}
		if(sumfact==num){
			System.out.print(" "+num);
		}
		}
	}
}