/*
Question 4: Write a Java program to implement a Voting Eligibility Checker.
Create a class Person with attributes name and age.
Check whether the person is eligible for voting.
Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Input:
Enter Name : Rohan
Enter Age : 16

Output:
Name : Rohan
Age : 16
Result : Not Eligible for Voting
*/
import java.util.*;
public class AgeEligibleCheck{
	public static void main(String args[]){
		AgeEligible a = new AgeEligible();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the age = ");
		int age =sc.nextInt();
		a.setValue(age);
		a.result();
	}

}

class AgeEligible {
	int age;
	void setValue(int x){
		age=x;
	}
	void result(){
		if(age>=18){
			System.out.print("Result :  Eligible for Voting ");
		}else{
			System.out.print("Result : Not Eligible for Voting ");
		}
	}
}