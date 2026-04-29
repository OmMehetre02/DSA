//Pattern
//HollowFullPyramidNum
public class FullPyramidNum{
public static void main(String[]args){
	
	for(int i=1;i<=6;i++){
		boolean b=true;
		int num=i;
		for(int j=1;j<=11;j++){
		if(j==7-i||j==5+i&& b){
				System.out.print(num);	
				if(j<=5){
					
						num++;	
				}else{
					num++;	
				}
			
				
				b=false;
			}
			else{
				System.out.print(" ");
				b=true;
			
		}
		}
		System.out.println();
	}
	
}
}