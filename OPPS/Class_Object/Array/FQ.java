import java.util.Scanner;
public class FQ{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size = ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter The Array Elements = ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Show fq :-");
		int count=0;
		int i;
		for( i=0;i<a.length-1;i++){
			if(a[i]==count){
				System.out.println(a[i]+"<-->"+count);
			}else{
				count++;
			}
			
			
		}
		
	}
}