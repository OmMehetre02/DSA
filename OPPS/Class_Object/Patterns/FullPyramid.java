//Pattern
//FullPyramid
public class FullPyramid{
public static void main(String[]args){
	
	for(int i=1;i<=6;i++){
		boolean b=true;
		for(int j=1;j<=11;j++){
		if(j>=7-i&&j<=5+i&& b){
			
				System.out.print("*");	
				
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
/*
public class HollowFullPyramid{
	public static void main (String[]args){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=7-i;j++){
				System.out.print("");
		}
		for(int k=1;k<=i;k++){
			System.out.print("* ");
		}
		
		System.out.println(" ");
		}
}
}
*/