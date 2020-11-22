/*

Given an array of integers. Find the Inversion Count in the array.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.


Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(nLogn).
Expected Auxiliary Space: O(n).

Constraints:
1 ≤ N ≤ 107
1 ≤ C ≤ 1018
 */



package Array;

import java.util.Scanner;

public class inversion_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long[] a = new long[Math.toIntExact(n)];
        for (int i = 0;i<n;i++){
            a[i] = scn.nextLong();
        }
        long ar = inversionCount(a, n);
        System.out.println(ar);
    }
    static long inversionCount(long arr[], long N)
    {
        long jump = 0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    jump++;
                    long temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return jump;
        // Your Code Here
    }
}
