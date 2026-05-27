//Count total even numbers in a matrix.
import java.util.*;
public class MatrixEvenCount{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		int a[][]=new int [3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<a.length;i++ ){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
				if(a[i][j]%2==0){
					count++;
				}
			}
			System.out.println();
		}
		System.out.print("EvenCount = "+count);
	}
}