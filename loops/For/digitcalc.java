public class digitcalc{
	public static void main(String args[]){
		int num,f,l,m;
		num=123;
		
		l=num%10;//15.3      3
		m=(num/10)%10;//15.3  15   5
		f=num/100;//1.53       1
		
		System.out.println(f+" "+m+" "+l+" "+(f+m+l));
	}
}