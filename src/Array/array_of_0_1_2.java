/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output:
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.*/





package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_of_0_1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t;i++){
            int n= scn.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n;j++){
                ar[j]=scn.nextInt();
            }
            List<Integer> list0 = new ArrayList<Integer>();
            List<Integer> list1 = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();
            for(int j=0; j<n;j++){
                if(ar[j]==0){
                    list0.add(ar[j]);
                }
                else if(ar[j]==1){
                    list1.add(ar[j]);
                }
                else{
                    list2.add(ar[j]);
                }
            }
            list0.addAll(list1);
            list0.addAll(list2);
            for(int k= 0; k<list0.size();k++){
                System.out.print(list0.get(k) + " ");

            }

            //list0.forEach(System.out::print);

        }
    }
}
