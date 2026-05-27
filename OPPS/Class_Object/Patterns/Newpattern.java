/* .*********
    **** ****
    ***   ***
    **     **  
    *       *
	             */
  public class NewPattern{
public static void main (String[]args){
	int i,j ;
	
	for(i=1;i<=5;i++){
		int num = 1;
		for(j=1;j<=9;j++){
			
			if(j<=6-i||j>=4+i){
				System.out.print(num);
				if(j<5||j>5){
                 
				num--;
					
					
				}else{
					
					num++;
				}
				
			}
			else{
				
				System.out.print(" ");
				
			}
		}
		System.out.println(" ");
	}
	
  } 
  }