/*
Q83. Write a java program to print this pattern.


	       1	A	2	B	3  
              C	  4   D   5  
                6	E	7  
              F   8	  G	  9  
           H	10	I	11	J
*/
public class patternQ83 {
	public static void main(String []args){
		int num=1;
		char ch='A';
		boolean b=true;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				
				if((j>=i&&j<=10-i||j>=6-i&&j<=4+i)&&b){
					if (j % 2!= 0 ){
						System.out.print(num++);
						
					}else{
					System.out.print(ch++);
					
					}
					//b=false;
					
				}else{
					System.out.print(" ");
				//	b=true;
				}
		}
		System.out.println();
		}
	}
}
