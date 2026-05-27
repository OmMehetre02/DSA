 //Q14. Write a java program swap two numbers using a third variable.
 public class Swaptwonumber{
 
 public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("Before swapping:");
        System.out.println("x = " +x);
        System.out.println("y = " + y);

        
        int z;
        z = x;
        x = y;
        y = z;

        System.out.println("\nAfter swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}