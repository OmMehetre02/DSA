/*
Q46. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
*/
public class PatternQ46{
	public static void main(String[]args){
		int num=0;
		for(int i=1;i<=9;i++){
			if(i<=5)
				num++;
			else
				num--;
			
			for(int j=1;j<=9;j++){
				
				if(j==6-i||j==4+i||j==i-4||j==14-i){
					System.out.print(num+"\t");
					
				}
				else{
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
	}
}

