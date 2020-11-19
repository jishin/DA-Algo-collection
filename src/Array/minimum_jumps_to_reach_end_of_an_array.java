/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

Input:
The first line contains an integer T, depicting total number of test cases.  Then following T lines contains a number n denoting the size of the array. Next line contains the sequence of integers a1, a2, ..., an.

Output:
For each testcase, in a new line, print the minimum number of jumps. If answer is not possible print -1.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
0 <= ai <= 107

Example:
Input:
2
11
1 3 5 8 9 2 6 7 6 8 9
6
1 4 3 2 6 7
Output:
3
2

Explanation:
Testcase 1: First jump from 1st element, and we jump to 2nd element with value 3. Now, from here we jump to 5h element with value 9. and from here we will jump to last.
 */



package Array;

import java.util.Scanner;

public class minimum_jumps_to_reach_end_of_an_array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i=0;i<t ;i++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n;j++){
                arr[j] = scn.nextInt();
            }
            int res = minJumps(arr);
            System.out.println(res);
        }
    }

    static int minJumps(int[] arr){
        // your code here
        int jump=1, stepsPssible=arr[0], maxReachable=arr[0];

        if(arr[0]==0){
            return -1;
        }else {
            for (int i = 1; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    return jump;
                } else {
                    maxReachable = Math.max(maxReachable, i + arr[i]);
                    stepsPssible--;
                    if (stepsPssible == 0) {
                        jump++;
                        if (i >= maxReachable) {
                            return -1;
                        } else {

                            stepsPssible = maxReachable - i;
                        }

                    }
                }
            }
        }


        return jump;
    }
}
