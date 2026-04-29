//Pattern
//HollowFullPyramidNum
public class HellowFullPyramidN{
public static void main(String[]args){
	
	for(int i=1;i<=5;i++){
		
		//boolean b=true;
		int num=2;
		for(int j=1;j<=9;j++){
	//	if(j==6-i||j==4+i){
			//	System.out.print(num);	
				if(j==6-i)
				{
					System.out.print(1);
				}	
				else if(j==4+i){
				
					System.out.print(i+" ");
						
				}
				else if(i==5&&j%2==1){
				//	if(j>1){
				
					System.out.print(num+"");
					num++;
						
					}
				//}
				
				//b=false;
			
			else{
				System.out.print(" ");
				//b=true;
			
		}
		}
		System.out.println();
	}
	
}
}