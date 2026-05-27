//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
    import java.util.Scanner;
	public class CheckProfitorLoss{
		public static void main (String[]args ){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter cost price and selling price");
			System.out.println(" Enter cost price ");
			int x = sc.nextInt();
			
			System.out.println(" Enter selling price ");
			int y = sc.nextInt();
			
			String res = x<y?"profit":"loss";
			System.out.println(" cost price ");
			System.out.println(res);
		}
	}