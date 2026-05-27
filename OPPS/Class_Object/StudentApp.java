/*
Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass
*/
import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    void setValue() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Id : ");
        id = sc.nextInt();

       

        System.out.print("\nEnter Student Name : ");
        name = sc.nextLine();

        System.out.print("Enter Marks : ");
        marks = sc.nextInt();
    }

    void SResult() {

        System.out.println("\nStudent Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks : " + marks);

        if (marks >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }
}

class StudentApp {

    public static void main(String args[]) {

        Student s = new Student();

        s.setValue();
        s.SResult();
    }
}