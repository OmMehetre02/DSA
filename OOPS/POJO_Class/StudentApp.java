/*
Question 1: Write a Java program to create a Student POJO class with fields rollNo, name and marks. Use a parameterized constructor to initialize values and display student details.

Description: Create a Student class having private data members rollNo, name and marks. Initialize values using a constructor and display details using an object. Demonstrate object initialization using constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78
*/
import java.util.*;
class student{
   private int rollNo;
   private String name;
   private int marks;
   
   public student(int rollNo,String name,int marks){
	   this.rollNo=rollNo;
	   this.name=name;
	   this.marks=marks;
   }
   public void display(){
	   
	   System.out.println("\n\nStudent Details:");
	   System.out.println("Roll No: "+rollNo);
	   System.out.println("Name: "+name);
	   System.out.println("Marks: "+marks);
	   
   }
   
}
public class StudentApp{
   public static void main(String []args){
	   Scanner sc= new Scanner (System.in);
	   System.out.print("Enter Roll No: ");
	   int rollNo=sc.nextInt();
	   sc.nextLine();
	   System.out.print("Enter Name: ");
	   String name=sc.nextLine();
	   System.out.print("Enter Marks: ");
	   int marks=sc.nextInt();

       // Create object using parameterized constructor
       
        student s =new student(rollNo,name,marks);
		
		s.display();
		
		sc.close();
          
  		  
   }

}