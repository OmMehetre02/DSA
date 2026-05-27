/*
Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input:
Enter Employee Id : 201
Enter Name : Amit
Enter Salary : 45000

Output:
Employee Id : 201
Name : Amit
Salary : 45000
Category : Medium Salary
*/
import java.util.*;
public class EmployeeApp{
	
     public static void main(String args[]){
		 employee e =new employee();
		 Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Id : ");
            int id = sc.nextInt();
            sc.nextLine(); //can be use next line
        
            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();
        
            System.out.print("Enter Salary : ");
            int salary = sc.nextInt();
        	  e.setValue(id, name, salary);
        	e.checkSalary();
	    
	 }
}
class employee{
	    int id;
    String name;
    int salary;

    void setValue(int i, String n, int s) {

        id = i;
        name = n;
        salary = s;
    }

	void checkSalary(){
		 System.out.println("\nStudent Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Salary : " + salary);
		if(salary>=50000){
			System.out.print("Category : High Salary ");
		}else if(salary >=20000&&salary<=50000){
			System.out.print("Category : Medium Salary ");
		}else{
			System.out.print("Category : Low Salary ");
		}
		
	}
}