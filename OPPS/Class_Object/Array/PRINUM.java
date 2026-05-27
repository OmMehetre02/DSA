public class PRINUM{
	public static void main(String[]args){
		int n=17;
		int count;
		for(int num=2;num<=n;num++){
			 count=0;
	          
				for(int i=1;i<=n;i++){
					if(num%i==0){
						count++;
					}
				}
				
				
			}
			if(count==2){
					System.out.print(true);
				}else{
					System.out.print(false);
				}  
		}
	}
