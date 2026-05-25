/*
find second largest number in arr {1,4,3,2,5} -> 4
2
3
4
4
5
67
->5
*/
public class SecLar{
	public static void main(String []args){
		int a[]={7,5,3};
		int large=0;
		int SecondLarge=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>large){
				int temp=a[i];
				a[i]=SecondLarge;
				SecondLarge=large;
				large=temp;
			}
			if(a[i]!=SecondLarge&&a[i]>SecondLarge){
			SecondLarge=a[i];
		}
		}
		
		System.out.print(SecondLarge);
	}
}