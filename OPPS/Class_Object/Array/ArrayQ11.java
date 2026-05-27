/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
public class ArrayQ11 {
	public static void main(String[] args) {
		int a[] = { 12, 35, 1, 10, 34, 1 };
		int largest = a[0];
		int SecondLargest = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				SecondLargest = largest;
				largest = a[i];

			} else if (a[i] > SecondLargest && a[i] != largest) {
				SecondLargest = a[i];
			}

		}
		System.out.print("Second largest number is = " + SecondLargest);
	}
}