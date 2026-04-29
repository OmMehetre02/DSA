import java.util.*;
public class TableApplication
{
    public static void main(String x[])
	{  Scanner xyz = new Scanner(System.in);
	   int no;
	   System.out.println("Enter number from keyboard");
	   no=xyz.nextInt();
	   table(no); //calling
	}
	public static void table(int no)
	{
	    for(int i=1; i<=10; i++)
		{ System.out.printf("%d\n",no*i);
		}
	}
}
