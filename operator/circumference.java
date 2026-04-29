import java.util.Scanner;
public class  circumference{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter circle of  circumference");
	double  circumference = sc.nextDouble();
	double radius  =  circumference/(2*3.14)	;
    System.out.println(radius);
	
}
}