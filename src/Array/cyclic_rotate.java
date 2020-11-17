/*

Given an array, cyclically rotate an array by one.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. Then following line contains 'n' integers forming the array.

Output:
Output the cyclically rotated array by one.

Constraints:
1<=T<=1000
1<=N<=1000
0<=a[i]<=1000

Example:
Input:
2
5
1 2 3 4 5
8
9 8 7 6 4 2 1 3

Output:
5 1 2 3 4
3 9 8 7 6 4 2 1
 */



package Array;

import java.util.Scanner;

public class cyclic_rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i=0;i<T;i++){
            int n=scn.nextInt();
            int[] ar = new int[n];
            int[] ar1 = new int[n];
            for(int j=0;j<n;j++){
                ar[j] = scn.nextInt();
            }
            ar1[0]=ar[n-1];
            for(int j=0;j<n-1;j++){
                ar1[j+1]= ar[j];
            }
            for(int k: ar1){
                System.out.print(k + " ");
            }
        }
    }
}
