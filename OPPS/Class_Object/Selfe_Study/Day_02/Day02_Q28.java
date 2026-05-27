//28 Linear search
import java.util.*;
public class Day02_Q28{
   public static void main(String args[]){
	  Scanner sc=new Scanner (System.in);
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=sc.nextInt();
	  }
	  boolean b=false;
	  System.out.print("Enter Search key = ");
	  int skey=sc.nextInt();
	   for(int i=0;i<a.length;i++){
		   
			   if(a[i]==skey){
				  System.out.print("Found index is " +i);
				  b=true;
				  break;
		   }
		   }
		    if(b==false){
			   System.out.print("Not Found");
		   }
	   

	   
	  
   }
}