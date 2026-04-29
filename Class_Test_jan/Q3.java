// Q3. Write a Java program to display the following series:  
// 3   6   12   24   48   96  192  
// (Each term doubles from the previous term starting at 3)

public class Q3{
	public static void main(String[]args){
	int n=7;
	int a=3;
	int b=2;
	for(int i=1;i<=n;i++){
		System.out.print(a+" ");
		int next=a*b;
		    a=a*b;
		next=a;
	}
	}
}`