import java.util.*;
public class RecAPPEven{
	static int count = 0;
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		Even(num);
		System.out.print(count);
	}
	public static void Even(int num){
		if(num>0){
			int digit=num%10;
			if(digit%2==0){
				count++;
			}
			num=num/10;
			Even(num);
		}
	}
}