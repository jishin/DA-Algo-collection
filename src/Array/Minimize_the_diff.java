/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer.
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as
{3, 3, 6, 8}. The difference between
the largest and the smallest is 8-3 = 5.

Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as
{6, 12, 9, 13, 17}. The difference between
the largest and the smallest is 17-6 = 11.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n and k as input parameters and returns an integer denoting the minimum difference.


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 104
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 105
 */

package Array;

import java.util.Collections;
import java.util.Scanner;

public class Minimize_the_diff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int K = scn.nextInt();
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int diff =getMinDiff(arr,n, K);
        System.out.println(diff);
    }
    static int getMinDiff(int[] arr, int n, int k) {
        Minimize_the_diff dif = new Minimize_the_diff();
        dif.sort(arr);

        int ans = arr[n-1]-arr[0];
        int small = arr[0]+k;
        int big = arr[n-1]-k;
        if(big<small){
            int temp = small;
            small=big;
            big=temp;
        }
        for (int j=1;j<n-1;j++){
            int sub=arr[j]-k;
            int add = arr[j]+k;
            if((small<=sub) || (big>=add)){
                continue;
            }
            if (big-sub <= add-small){
                small=sub;
            }
            else {
                big=add;
            }
        }
        return Math.min(ans, big-small);



//        if(arr[n-1]<k){
//            return (arr[n-1]-arr[0]);
//        }else{
//            int m=0;
//            for (int j=0;j<n;j++){
//                if(arr[j]>=k){
//                    m=j;
//                    break;
//                }
//            }
//            int[] ar1=new int[n];
//            for (int j=0;j<m;j++){
//                ar1[j]=arr[j]+k;
//            }
//            for (int j=m;j<n;j++){
//                ar1[j]=arr[j]-k;
//            }
//            dif.sort(ar1);
//            return (ar1[n-1]-ar1[0]);
//        }

    }
    public void sort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
