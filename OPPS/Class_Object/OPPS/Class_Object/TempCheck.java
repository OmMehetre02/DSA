/*
Question 5: Write a Java program to implement a Temperature Checker.
Create a class Temperature with attribute temp.
Check the weather condition:
- temp > 35 => Hot
- temp 20 to 35 => Normal
- temp < 20 => Cold
Input:
Enter Temperature : 18

Output:
Temperature : 18
Weather : Cold
*/
import java.util.*;
public class TempCheck{
	public static void main(String args[]){
		Temperature t = new Temperature();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Temperature = ");
		int temp =sc.nextInt();
		t.setValue(temp);
		t.result();
	}

}

class Temperature {
	int temp;
	void setValue(int x){
		temp=x;
	}
	void result(){
		if(temp>=35){
			System.out.print("Weather :  Hot ");
		}
		else if(temp>=20&&temp<=35){
		    System.out.print("Weather : Normal ");
		}else{
			System.out.print("Weather : Cool ");
		}
	}
}