import java.util.*;
public class RecAPP{
	static int count=0;
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		countofdigit(num);
		System.out.print(count);
	}
	public static void countofdigit(int num){
		if(num>0){
			num = num/10;
			count++;
		
			countofdigit(num);
		}
		
		
	}
}