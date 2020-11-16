



/*

Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case contains two space separated integers N and M, where N is the size of array A and M is the size of array B. The second line of each test case contains N space separated integers denoting elements of array A. The third line of each test case contains M space separated integers denoting elements of array B.

Output:
Correspoding to each test case, print the count of union elements of the two arrays.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(N + M).

Constraints:
1 ≤ T ≤ 100
1 ≤ N, M ≤ 105
1 ≤ A[i], B[i] < 105

Example:
Input:
2
5 3
1 2 3 4 5
1 2 3
6 2
85 25 1 32 54 6
85 2
Output:
5
7

Explanation:
Testcase 1: 1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays.
Testcase 2: 1 , 2 , 6 , 25 , 32 , 54 and 85 are the elements which comes in the union set of both arrays.
 */


package Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union_of_two_arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i =0 ;i<T;i++){


            int n=scn.nextInt();
            int m = scn.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int j = 0 ; j<n;j++){
                arr1[j] = scn.nextInt();
            }
            for (int k = 0; k<m;k++){
                arr2[k] = scn.nextInt();
            }



            List<Integer> list1 = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();
            List<Integer> list11 = new ArrayList<Integer>();
            List<Integer> list22 = new ArrayList<Integer>();
            //List<Integer> listU = new ArrayList<Integer>();
            for (int j = 0 ; j<n;j++){
                list1.add(arr1[j]);
            }
            for (int j = 0 ; j<m;j++){
                list2.add(arr2[j]);
            }

            for( int q : list1){
                if(!list11.contains(q)){
                    list11.add(q);
                }
            }
            for( int q : list2){
                if(!list22.contains(q)){
                    list22.add(q);
                }
            }
            for( int q : list22){
                if(!list11.contains(q)){
                    list11.add(q);
                }
            }





            int val = list11.size();

            System.out.println(val);


        }

    }


}
