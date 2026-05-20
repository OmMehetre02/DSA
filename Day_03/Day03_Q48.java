//48 Function to check Armstrong number
import java.util.*;
 public class Day03_Q48{
    public static void main(String args[]){
 	   Scanner sc = new Scanner (System.in);
	   System.out.print("Enter The Value = ");
	   int num=sc.nextInt();
	   
	   Armstrong(num);
	  
    }
	public static void Armstrong(int n){
	int temp=n;
	 int count=0;
	 while(temp!=0){
		 count++;
		 temp=temp/10;
	 }
	 int tem=n;
	 int sum=0;
	 while(tem!=0){
		 int digit=tem%10;
		 int power=1;
		 for(int i=0;i<count;i++){
			 power=power*digit;
		 }
		 sum+=power;
		 tem=tem/10;
	 }
	 if(sum==n){
		 System.out.print("Armstrong number ");
	 }else{
		 System.out.print("not Armstrong number ");
	 }
	
 }
 }