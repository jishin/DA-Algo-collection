package Array;

import java.util.Scanner;
//import com.company.BubbleSort;



/*

Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth
smallest element in the given array. It is given that all array elements are distinct.

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow.
Each test case consists of three lines. First line of each testcase contains an integer N denoting size of the array.
Second line contains N space separated integer denoting elements of the array. Third line of the test case contains
an integer K.

Output:
Corresponding to each test case, print the kth smallest element in a new line.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N

Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4
Output:
7
15

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.
Testcase 2: 4th smallest elemets in the given array is 15.


*/

public class kth_element {
    /*public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt();
        for(int i = 0 ; i<T;i++){
         int n = scn.nextInt();
         int ar[] = new int[n];
         for(int j=0;j<n;j++){
            ar[j]=scn.nextInt();
         }
         int k = scn.nextInt();
         int[] ar2=BubbleSort.sort2(ar);
         System.out.println(ar2[k-1]);
        }
    }*/
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scn.nextInt();
            int ar[] = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = scn.nextInt();
            }
            int k = scn.nextInt();
            int[] ar2 = sorted(ar);
            System.out.println(ar2[k - 1]);
        }
    }
    static int[] sorted(int[] arr){
        int n=arr.length;
        int temp=0;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        return arr;
        }
}
