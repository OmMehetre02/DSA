
//Q88 Merge Sorted Array Leetcode
import java.util.*;

public class LeetCodeQ88 {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3 };  //gdfgdfg
		int b[] = { 2, 4 };
		int c[] = new int[a.length + b.length];

		for (int i = 0, j = a.length; i < a.length; i++, j++) {
			c[i] = a[i];
			c[j] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}