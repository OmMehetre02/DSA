//161 Rabin-Karp algorithm 


import java.util.*;

public class Day08_161
{
	public static void main(String args[]) {

	 Scanner sc = new Scanner(System.in);
	

        String txt = "ABCCDDAEFG";
        String pat = "CDD";

        int index = txt.indexOf(pat);

        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}