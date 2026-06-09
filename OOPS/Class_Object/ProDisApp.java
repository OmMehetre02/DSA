/*Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800
*/
import java.util.*;
public class ProDisApp{
	public static void main(String args[]){
		product p=new product();
		p.getData();
		p.display();
	}
   
}
class product{
	int productId;
	String name;
	double price;
	void getData(){
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter Product Id : ");
		productId=sc.nextInt();
		sc.nextLine();
		System.out.print(" Enter Product Name : ");
		name=sc.nextLine();
		System.out.print(" Enter Price : ");
		price=sc.nextDouble();
	}
	void display(){
		double discount=0;
		if(price>5000){
			discount=20;
		}else if(price>=2000){
			discount=10;
		}else{
			discount=0;
		}
		double finalPrice= price-(price*discount/100);
		System.out.print("\nProduct Id : "+productId);
		System.out.print("\nProduct Name : "+name);
		System.out.print("\nOriginal Price :"+price);
		System.out.print("\nDiscount : "+discount+"%");
		System.out.print("\nFinal Price : "+finalPrice);
		
	}
}