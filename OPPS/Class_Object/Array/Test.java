import java.util.Scanner;
class Test 
{
    public static void main(String[]args) 
	{
		Scanner sc = new Scanner (System.in);
        
		/* int  low=3;	  System.out.print(true);
		int  high=7;
		 int count=0;
      for(int i=low;i<=high;i++){
		  
       
        if(i%2!=0){
         count++;
         
        }
           
      }
	 System.out.print(count); 
	 int n=sc.nextInt();
	 if(n<=0)
	 {
		 	  System.out.print(false);
			  return;
	 }
	 
	 while(n%3==0)
	 {
		 n=n/3;
		 
	 
	  }
	 if(n==1)
	 {
		 	  System.out.print(true);
	 }else
	 {
		   System.out.print(false);
	
	 
  
     }
     */
	 
	/*  for(int i=1;i<=5;i++){
		 int num=1;
		 for(int j=1;j<=5;j++){
			 System.out.print(num+++" ");
			
		 }
		 System.out.println();
	 }*/

	 
	 
	 
	 
	 
	 
	 // perfect number program ;
	 // int num=28;
	 // int sum=0;
	 // for(int i=1;i<=num/2;i++){
		 // if(num%i==0){
			 // sum=sum+i;
		 // }
	 // }
	 // if(sum==num){
		 // System.out.print(num+" perfect number");
	 // }
	 // else{
		 // System.out.print(num+" not perfect number");
	 // }
	 
	 
	 
	 
	 
	 
	// Digit Frequency
	// int num=114455;
	// for(int i=1;i<=9;i++){
		// int temp=num;
		// int count =0;
		// while(temp>0){
			// int digit=temp%10;
			// if(digit==i){
				// count++;
			// }
			// temp=temp/10;
		// }
		// if(count>0)
		// System.out.println(i+"<---->"+count);
	// }
	 
	 
	 
	 
	 
	// Q6. Even & Odd Digits
	 
	 // int num=123456789;
	// int even =0;
	// int odd=0;
	// while(num>0){
		
		// int digit=num%10;
		// if(digit%2==0){
			// even++;
		// }
		// else{
			// odd++;
		// }
		// num=num/10;
	// }
	// System.out.print("even digit count is = "+even+"\n");
	// System.out.print("odd digit count is = "+odd);
	
	
		// for(int i=1;i<=5;i++){
			// char ch = 'A';
			// int num = 1;
			// for(int j=1;j<=5;j++){
				// if(j<=i){
					// System.out.print(ch+++" ");
				// }else{
					// System.out.print(num+++" ");
				// }
			// }
			// System.out.println();
		// }

	
      
          // for(int i=1;i<=9;i++)
          
        // {
			// char ch = 'A';
              // for(int j=1;j<=9;j++)
            // {                                                                                                                                       
            // if(j>=6-i&&j<=4+i&&j>=i-4&&j<=14-i)
            // {
                // System.out.print(" "+ch+++" ");
            // }else
            // {
                // System.out.print("   ");
            // }
            // } 
            // System.out.println();
        // }
   
//Sum of digit 
	    // int num=587;
		// int sum=0;
		// while(num>0){
			// int digit=num%10;
			// sum=sum+digit;
			// num=num/10;
		// }
	
	// System.out.print(sum);
	
	

	
	// int num=sc.nextInt();
	
		// int n500=num/500;
		
		    // num=num%500;
			
		// int n200=num/200;
		    // num= num%200;
			
	    // int n100=num/100;
		    // num= num%100;
			
	    // int n50=num/50;
		    // num= num%50;
			
	    // int n20=num/20;
		    // num= num%20;
			
	    // int n10=num/10;
		    // num= num%10;
	    
		// int n5=num/5;
		    // num= num%5;
	    
		// int n2=num/2;
		    // num= num%2;
	   
	   // int n1=num/1;
		    // num= num%1;
       		
	// System.out.print(" 500 = "+n500+" 200 = "+n200+" 100 = "+n100+" 50= "+n50+" 20 = "+n20+" 10 = "+n10+" 5 = "+n5+"2 = "+n2+" 1 = "+n1);
	
	
	
	// Q1. Write a Java program to convert seconds to hours, minutes and seconds. 
	
	// int TotalSecond=3665;
	
        // int hours = TotalSecond/3600;
		// TotalSecond=TotalSecond%3600;
		// int minutes=TotalSecond/60;
		// TotalSecond=TotalSecond%60;
		
		// System.out.print("    hours is = "+hours+
		                   // "\n    minutes is = "+minutes+
						   // "\n    seconds is = "+TotalSecond);
						   
						   
						  
						  
			//Q2. Write a java program swap two number without using third variable. 
	     
		 
		 // int a=10;
		 // int b=20;
		 
		 // System.out.print(" a = "+a+"   b = "+b+"\n");
		 // a=a+b;
		 // b=a-b;
		 // a=a-b;
		 // System.out.println(" After The Swaping ");
		 // System.out.print(" a = "+a+"   b = "+b);
		 
		 
		  // Q3. Write a java program to enter two angles of a triangle and find the third angle. 
		  
		  // int totalSumAngle=180;
		   // System.out.print("Enter THE first Angle =");
		 // int a =sc.nextInt();
		 // System.out.print("Enter THE first Angle = ");
		 // int b =sc.nextInt();
		 
		
		// if(180>(a+b)) {
		 // int c=totalSumAngle-(a+b);
		 // System.out.print("Third angle = "+c);
		// }else{
			// System.out.print("Not valid TRinagle");
		// }
		 
		   //Q4. Write a java program to check whether number is palindrome or not palindrome using ternary operators. 
                                                             
              // int num=121;
			  // int original =num;
			  // int revers=0;
			  // while(num>0){
				  // int digit=num%10;
				  // revers=revers*10+digit;
				  // num=num/10;
			  // }
				// String res = (original==revers)?"number is palindrome"	:"number is palindrome";		
             // System.out.print(res);	
           
             
			 // Q5. Write a java program to input any character and check whether it is alphabet, digit or special 
              // character. 


		   // char ch=sc.next().charAt(0);
             // if(ch >='A'&&ch<='Z'||ch >='a'&&ch<='z')
			 // {
				 // System.out.print("it is alphabet...");
			 // }			
			 // else if(ch>='0'&&ch<='9')
			 // {
				 // System.out.print("it is digit");
			 // }
			 // else
			 // {
				 // System.out.print("it is special character");
			 // }
			 
			 
			 // Q7. Write a Java program to check whether a triangle is equilateral , isoscale 
                 // or scalene. 
				 
				 // int a=sc.nextInt();
				 // int b=sc.nextInt();
				 // int c=sc.nextInt();
				 // if(a+b>c&&b+c>a&&a+c>b){
				 // if(a==b&&b==c){
					 // System.out.print("it is equilateral");
				 // }else if(a==b||b==c||a==c){
					 // System.out.print("it is isoscale");
				 // }else{
					 // System.out.print("it is scalene");
				 // }
				 // }else
				 // {
					 // System.out.print("Not valid triangle");
				 // }
				 
				 
				 
				 
				   // Q9. Create a Java program to simulate a simple calculator using a switch case. 
                     // It should take two numbers and an operator (+, -, *, /, %) as input and perform 
                      // the corresponding operation. 
					  
					  // System.out.print("Enter The First value = ");
					  // int a=sc.nextInt();
					  
					  // System.out.print("Enter The Second valu = ");
					  // int b=sc.nextInt();
					  
					  // System.out.print("Use Operator (+, -, *, /, %):");
					  // char op = sc.next().charAt(0);
					  // switch(op)
					  // {
						  // case '+':
						  // System.out.print("result"+(a+b));
						  // break;
						  
						  // case '-':
						  // System.out.print("result"+(a-b));
						  // break;
						  
						  // case '*':
						  // System.out.print("result"+(a*b));
						  // break;
						  
						  // case '/':
						  // if(b!=0)
						  // {
						  // System.out.print("result"+(a/b));
						  // }else
						  // {
							 // System.out.print("not divisible by 0"); 
						  // }
						  // break;
						  
						  // case '%':
						  // System.out.print("result"+(a%b));
						  // break;
						  
						  // default:
						  // System.out.print(" invalid operator ");
						  // break;
						  
						  
					  // }
					  
					   // Q10. Write a menu-driven program in java using switch case. 
                        // 1. input any alphabet and check whether it is vowel or consonant. 
                        // 2.Find the max number using 3 numbers. 
                        // 3. input any number & check number is divisible by 5 & 11.
						
					  // System.out.print(" 1. input any alphabet and check whether it is vowel or consonant."+
					                   // "\n 2.Find the max number using 3 numbers."+
					                   // "\n 3.input any number & check number is divisible by 5 & 11.");
	            // System.out.println("\n \n Enter The case number ");
				// char ch=sc.next().charAt(0);
				// switch(ch)
				// {
					// case '1':
					// System.out.print("Enter The Alphabet = ");
					 // char alpha=sc.next().charAt(0);
					 // if(alpha>='A'&&alpha<='Z'||alpha>='a'&&alpha<='z'){
						 // if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U'||alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
						 // {
							 // System.out.print("it is vowel...");
						 // }
						 // else
						 // {
							 // System.out.print("it is consonant...");
						 // }
					 // }
					 // else
					 // {
						 // System.out.print("it is not alphabet");
					 // }break;
                         	
					// case '2':
					// System.out.print("Enter the three Value \n");
					// int a=sc.nextInt();
					// int b=sc.nextInt();
					// int c=sc.nextInt();
					
					// if(a>b&&a>c)
					// {
						// System.out.print("a is max "+a);
					// }else if(b>a&&b>c)
					// {
						// System.out.print("b is max "+b);
					// }else
					// {
						// System.out.print("c is max "+c);
					// }
					// break;
					
				
				// case '3':
				// System.out.print("Enter The Number = ");
				// int num=sc.nextInt();
				// if(num%11==0&&num%5==0){
					// System.out.print(" number is divisible by 5 & 11.");
				// }else{
					// System.out.print(" number is  NOT divisible by 5 & 11.");
				// }
				// break;
				
				// default:
				// System.out.print("Invalid choice");
				// }	
				
				
				   // Q3. Write a java program to print this pattern. 
 
                 // 1 
                 // 2 * 2 
                 // 3 * 3 * 3 
                 // 4 * 4 * 4 * 4 
                 // 3 * 3 * 3 
                 // 2 * 2 
                 // 1
				// int num =0;
				// for(int i=1;i<=7;i++){
					// if(i<=4)
					// {
						// num++;
					// }
					// else if(i>4)
					// {
						// num--;
					// }
					
				// for(int j=1;j<=num;j++){
					// System.out.print(num);
					// if(j<num){
						
						// System.out.print("*");
					// }
					// }

					// System.out.println();
				// }
				
				
				
/* 				  Q4. Write a java program to print this pattern. 
 
                         * 
                       * * * 
                     *   *   * 
                   *     *     * 
                 * * * * * * * * * 
                   *     *     * 
                     *   *   * 
                       * * * 
                         *
						 
						  */
				
				// for(int i=1;i<=9;i++){
					// for(int j=1;j<=9;j++){
						// if(j==6-i||j==4+i||j==i-4||j==14-i||i==5||j==5){
							// System.out.print(" * ");
						// }else{
							// System.out.print("   ");
						// }
					// }
					// System.out.println();
				// }
				
				
				 // Q9. Write a java program to Check Number Is Spy Number or Not. 
                    // Example : A number is said to be a Spy number if the sum of all the digits is equal to the product 
                    // of all digits. 
                     // Input : 1412 
                     // Output : Spy Number
				
				// int num=1412;
				// int temp=num;
				// int sum=0;
				// int product=1;
				// while(num>0){
					// int digit=num%10;
					// sum=sum+digit;
					// product=product*digit;
					// num=num/10;
				// }
				// if(sum==product){
					// System.out.print("it is Spy Number");
				// }else{
					// System.out.print("it is not Spy Number");
				// }
				
				 // Q7. Write a Java program to display the Fibonacci series up to n terms. 
                     // If the user enters n = 7, 
                     // then the output should be: 
                     // 0 1 1 2 3 5 8
					 
					 // int n=7;
					 // int a=0;
					 // int b=1;
					 // for(int i=0;i<n;i++){
						 // System.out.print(a+" ");
						 // int next=a+b;
						      // a=b;
							  // b=next;
							 
					 // }
					 // Q2. Write a java program to print this pattern. 
 
                           // A             A 
                           // A B         B A 
                           // A B C     C B A 
                           // A B C D D C B A 
                           // A B C     C B A 
                           // A B         B A 
                           // A             A
				
			// for(int i=1;i<=7;i++)
			// {
				// for(int j=1;j<=8;j++)
				// {
					// if(((j<=i||j>=9-i)&&i<=3)||((j>=i||j<=9-i)&&i>3))
					// {
						// System.out.print(" * ");
					// }
					// else
					// {
							// System.out.print("   ");
					// }
				// }
				// System.out.println();
			// }
			
			
			
			
			
			// Q83. Write a java program to print this pattern.


	          // 1	 A	 2	 B	 3  
                // C   4   D   5  
//                   6   E   7  
 //                F   8   G   9  
//               H	 10	 I   11  J

           

 // int num = 1;
        // char ch = 'A';

        // for (int i = 1; i <= 5; i++) {

            // for (int j = 1; j <= 9; j++) {

                // if ((j >= 6 - i && j <= 4 + i) || (j >= i && j <= 10 - i)) {

                    // Alternate printing
                    // if ((i + j) % 2 == 0) {
                        // System.out.print(num + "\t");
                        // num++;
                    // } else {
                        // System.out.print(ch + "\t");
                        // ch++;
                    // }

                // } else {
                    // System.out.print("\t");
                // }
            // }
            // System.out.println();
        // }
		
		
		// Q41. Write a java program to print this pattern.

	// 1
	// 3	3	3
	// 5	5	5	5	5	
	// 3	3	3
	// 1

      int num=1;
	  for(int i=1;i<=5;i++){
		 
		  for(int j=1;j<=5;j++){
			  if(j<=num){
				  System.out.print(num);
			  }
		  }
		   if(i<3){
			  num=num+2;
		  }else if(i>=3){
			  num=num-2;
		  }
		  System.out.println();
	  }
		
	}
}