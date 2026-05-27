/*
Q34. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5


Explanation:


Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.


Therefore, the first repeating element is 5.
*/
public class ARRAQ34{
	public static void main(String []args){
		int a[]={10,5,3,10,3,5,6};
		boolean b=false;
		for(int i=0;i<a.length;i++){
			int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){//check elements
				     b=true;
					System.out.print(a[i]);
				b=true;
				
				break;
			}
			}
			if(b){     //already seen earlier → repeating, but not the first repeating (
				break;
			}
		
		}
		if(!b){
			System.out.print("not repeating elements");
		}
		
	}
	
}