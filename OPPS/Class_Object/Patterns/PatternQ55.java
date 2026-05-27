/*
Q55. Write a java program to print this pattern.

					1
               1	2	1	
          	1	2	3	2	1
        1	2	3	4	3	2	1
 			1	2	3	2	1	
                1	2	1	
                    1

*/

public class PatternQ55{
	public static void main(String[]args){
		
		for(int i=1;i<=7;i++){
			int num=1;
			for(int j=1;j<=7;j++){
				if(j>=5-i&&j<=3+i&&j>=i-3&&j<=11-i){
					System.out.print(num+"\t");
					if(j<4)
						num++;
					else
						num--;
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}