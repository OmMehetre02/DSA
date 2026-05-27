/*Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
*/
public class ArrayQ05{
	public static void main (String []args){
		int Elements[]={12,17,24,39,40,55,70};
		int EvenCount=0;
		int OddCount=0;
		for(int i=0;i<Elements.length;i++){
			if(i%2==0){
				EvenCount++;
			}else{
				OddCount++;
			}
			
		}
		System.out.println("Count of Even Values = "+EvenCount);
			System.out.println("Count of Odd Values = "+OddCount);
	}
}