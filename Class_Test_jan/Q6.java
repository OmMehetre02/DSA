 /*
 
Q6. Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the 
two sorted arrays. 
The overall run time complexity should be O(log (m+n)). 
Example 1: 
Input: nums1 = [1,3], nums2 = [2] 
Output: 2.00000 
Explanation: merged array = [1,2,3] and median is 2.
*/
public class Q6 {
    public static void main(String[] args) {

        int a1[] = {1, 3};
        int a2[] = {2};

        int a3[] = new int[a1.length + a2.length];

        // copy first array
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }

        // copy second array
        for (int i = 0; i < a2.length; i++) {
            a3[a1.length + i] = a2[i];
        }

        // sort the merged array
        for (int i = 0; i < a3.length; i++) {
            for (int j = i + 1; j < a3.length; j++) {
                if (a3[i] > a3[j]) {
                    int temp = a3[i];
                    a3[i] = a3[j];
                    a3[j] = temp;
                }
            }
        }

        // find median
        int n = a3.length;
        double median;

        if (n % 2 == 0) {
            median = (a3[n/2] + a3[n/2 - 1]) / 2.0;
        } else {
            median = a3[n/2];
        }

        System.out.println("Median = " + median);
    }
}









