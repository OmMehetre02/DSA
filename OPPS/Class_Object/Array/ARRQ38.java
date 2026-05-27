/*
Q38. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/
public class ARRQ38{
	public static void main(String[]args){
		int a[]={0,1,3,4,5,6,7,9};
		int num=0;
		boolean b=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				num++;
				b=true;
			}
		}
		if(b){
			System.out.print(num);
		}
	}
}