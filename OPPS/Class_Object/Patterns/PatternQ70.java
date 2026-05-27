/*
Q70. Write a java program to print this pattern.

	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13
*/
public class PatternQ70{
	public static void main (String[]args){
		char ch ='A';
		int num =1;
		boolean b= true;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(b){
					System.out.print(num+"\t");
					num++;
					b=false;
				}else{
					System.out.print(ch+"\t");
					ch++;
					b=true;
				}
				
			}
			System.out.println();
			
		}
	}
}