/*
Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
                Descending Order: [34, 12, 9, 5, 1]
*/

 
 
public class AssigmentQ05{
	public static void main (String []arg){
		int a[]={12,5,9,34,1};
		System.out.print("Ascending Order:");
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					    a[i]=a[j];
						a[j]=temp;	
				}
			}
			System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.print("Descending Order:");
				for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]<a[j]){
						int temp=a[i];
						    a[i]=a[j];
							a[j]=temp;
					}
				}
				System.out.print(a[i]+" ");
			}
			
	}
	
}