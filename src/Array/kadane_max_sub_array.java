/*

youtube:- https://www.youtube.com/watch?v=86CQq3pKSUw

Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output: 9
Explanation: Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output: -1
Explanation: Max subarray sum is -1
of element (-1)
Your Task:
The task is to complete the function maxSubarraySum() which returns the sum of subarray with maximum sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107
 */



package Array;

import java.util.Scanner;

public class kadane_max_sub_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for (int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        int res = maxSubarraySum(ar,n);

        System.out.println(res);


    }
    static int maxSubarraySum(int arr[], int n){
        int maxCurrent=arr[0];
        int maxGlobal=arr[0];
//        for (int i=1;i<n;i++){
//            if(maxCurrent<maxCurrent+arr[i]){
//                maxCurrent=maxCurrent+arr[i];
//                if(maxGlobal<maxCurrent){
//                    maxGlobal=maxCurrent;
//                }
//            }
//        }
        for (int i=1;i<n;i++){
            maxCurrent=Math.max(arr[i],maxCurrent+arr[i]);
            maxGlobal=Math.max(maxCurrent,maxGlobal);
        }
        return maxGlobal;
    }
}
