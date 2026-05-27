public class TestPa1{
	public static void main(String []args){
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=8;j++){
				if((j<=i||j>=9-i))
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
		    System.out.println();
		}
	}
} 