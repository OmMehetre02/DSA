//36 Count frequency of array elements 


import java.util.*;
public class Day02_Q36{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	   
		  
	for(int i=0;i<a.length;i++){
		 int count=1;
		 boolean b=false;
		 for(int k=0;k<i;k++){
			 if(a[i]==a[k]){
				 b=true;
			    break;
			 }
		 }
		 if(b==true){
			 continue;
		 }
		 for(int j=i+1;j<a.length;j++){
			 if(a[i]==a[j]){
				 count++;
			 }
		 }
		 System.out.print(a[i]+"------------->"+count+"\n");
		
	}
	   

	   
	  
   }
}