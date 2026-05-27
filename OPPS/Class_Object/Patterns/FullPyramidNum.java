// pattern
// FullPyramidNum


public class FullPyramidNum{
public static void main(String[]args){
	
	for(int i=1;i<=5;i++){
		boolean b=true;
		int num = i;
		for(int j=1;j<=11;j++){
		
		if(j>=7-i&&j<=5+i&&b){		
			System.out.print(num);
				//b=false;
				 if (j <=5) {
                        num++;  // increase before middle
                    } else {
                        num--;  // decrease after middle
                    }

			}
			else{
				System.out.print(" ");
				//b=true;
			}
		}
		
		System.out.println();
	}
	
}
}