//Reverse a given number.
public class ReverseNum{
	public static void main(String[]args){
	
		int	reverse = 0;
		int num = 12345;
		for(;num!=0;num/=10){
			int lastdigit=num%10;
			reverse= reverse*10+lastdigit;
	       
		}
			
			System.out.println(reverse);
		
	}
}