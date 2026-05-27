  //Q38. Write a Java program to check whether a year is a leap year or not.

  
  import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

     
        String res = (year % 400 == 0) ? "is a leap year." : 
                        ((year % 4 == 0 && year % 100 != 0) ? "is a leap year." : "is not a leap year.");

        System.out.println(year + " " + res);
}
}
