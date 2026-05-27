public class Fullpyramid02{
public static void main (String[]args){
for(int i=1;i<=5;i++){
	int num=i;
  for(int j=1;j<=10;j++){
  if(j>=6-i&&j<=4+i){
   System.out.print(num);
  if(j<64+i){
	  num++;
  }else{--
		  num--;
	  }
	 
	  
  
  }
  else{
   System.out.print(" ");
  }
  }
   System.out.println();
}

}
}