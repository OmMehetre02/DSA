//121 Function overloading example —
import java.util.*;
public class Day07_121{
    public static void main (String args []){
	    Day07_121 obj=new Day07_121();
		
		obj.add(5);
		obj.add(5,6);
		obj.add(5,6,7);
	}
	void add(int a){
		System.out.print("Number = "+a);
	}
	void add(int a,int b){
		System.out.print("\nAdd Two num = "+ (a+b));
	}
	void add(int a,int b,int c){
		System.out.print("\nAdd Three num = "+ (a+b+c));
	}
}