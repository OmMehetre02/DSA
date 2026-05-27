//pattarn test
/* public class TestPa{
  public static void main(String [] args){
	  int num=1;
      for(int i=1;i<=5;i++){
		  
		  
	     for(int j=1;j<=num;j++){
		    
			   System.out.print(num);
			
		 }
		 if(i<3){
			  num=num+2;
		  } else if(i>=3){
			  num=num-2;
		  }
		 System.out.println();
	  }
  }
} */

/*Q43. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5

public class TestPa{
    public static void main(String[]args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<i){
					System.out.print(i+" ");
				}else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
*/
/* Q83. Write a java program to print this pattern.


	1	A	2	B	3  
      C	  4   D   5  
        6	E	7  
      F   8   G   9  
    H	10	I	11	J */
/* public class TestPa{
    public static void main(String[]args){
	    int count =1;
		int num=1;
		char ch ='A';
		for(int i=1;i<=5;i++){
				
			boolean b = true;
			for(int j=1;j<=9;j++){
				
				
				if((j>=6-i&&j<=4+i||j>=i&&j<=10-i)){
					if(b){
					if(count%2==1){
						System.out.print(num++);
					}else {
						System.out.print(ch++);
					}
					count++;
					b=false;
					}else{
						System.out.print(" ");
						b=true;
					}
					
				}else{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}
} */


/* Q84. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D */
/* 
public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=7;i++){
			char ch='D';
			for(int j=1;j<=4;j++){
				if(i>=j&&j<=8-i){
					System.out.print(ch--+"\t");
				}
			}
			
			
			System.out.println();
		}
	}
}
 */
 /* 
 Q81. Write a java program to print this pattern.

       A	B	C	D	E	D	C	B	A
       A								A
       A								A
       A								A
       A								A
 */
 /* public class TestPa{
	public static void main(String []args){
		
		for(int i=1;i<=5;i++){
			 char ch = 'A';
			  for(int j=1;j<=9;j++){
				  if(i==1){
					 
					   System.out.print(ch+"\t");
					   
					  
					  if(j<5){
						  ch++;
					  }else{
						  ch--;
					  }
				  }else if(j==9||j==1){
						  System.out.print('A'+"\t");
					  }
				  else{
					  System.out.print("\t");
				  }
				  
			  }
			  System.out.println();
		}
	}
 } */
 /*/*  Q80. Write a java program to print this pattern.

	A      					    A
    A	B    				B	A
    A	B	C  			C	B	A
    A	B	C	D	D	C	B	A
    A	B	C  			C	B	A
    A	B   				B	A
    A							A
   */  /*
 public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=8;j++){
				if((j<=i||j>=9-i)&&(i<=j-1||j<=8-i)){
					
					if(j<=4){
						System.out.print(ch+" ");
						ch++;
					}else if(j>=4) {
						--ch;
						System.out.print(ch+" ");
						
					}
				}else{
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}
	}
} */
 
 
/* Q18. Write a java program to print this pattern.

	        *	*	*	*	*	*	
              *   *	  *   *   *        
		        *	*	*	*
		          *   *   *
			        *   *
			          *
 */
/* public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=6;i++){
			boolean b=true;
			for(int j=1;j<=11;j++){
				if(j>=i&&j<=12-i&&b){
					System.out.print("*");
					b=false;
				}else{
					System.out.print(" ");
					b=true;
				}
			}
			System.out.println();
		}
	}
} */
/* 
Q19. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*
 */
/*  public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=7;j++){
				if(j==i||j==1||i==1||j==8-i||j==7||i==7){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			
			
			System.out.println();
		}
	}
}  */

/*
Q24. Write a java program to print this pattern.

				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
	     		*
*/	
/*  public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=9;i++){
			char ch='A';
			for(int j=1;j<=9;j++){
				if(j==6-i||j==4+i||j==i-4||j==14-i||j==5||i==5){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			
			
			System.out.println();
		}
	}
}  */
/* 
Q25. Write a java program to print this pattern.

	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*
 */
 /*  public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=9;i++){
	
			for(int j=1;j<=9;j++){
				if((j<=6-i||j>=4+i)||(j<=i-4||j>=14-i)){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			
			
			System.out.println();
		}
	}
}  */

/* Q26. Write a java program to print this pattern.

	*						*
	*	*				*
	*	*	*		*
	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*	*
	*	*	*	*	*	*	*
 */
/*   public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=7;i++){
	
			for(int j=1;j<=7;j++){
				if(j==8-i||j<=i){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			
			
			System.out.println();
		}
	}
}  */

 
/* Q27. Write a java program to print this pattern.

	*
	*	*
	*	*	*
	*
	*	*
	*	*	*
 */
 
 public class TestPa{
	public static void main(String []args){
		for(int i=1;i<=6;i++){
	        int star;
			if(i<=3){
				star=i;
			}else {
				star=i-3;
			}
			for(int j=1;j<=star;j++){
				
					System.out.print(" * ");
				
			}
			
			
			System.out.println();
		}
	}
}  