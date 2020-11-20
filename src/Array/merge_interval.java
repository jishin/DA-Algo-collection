/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */


package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class merge_interval {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][2];
        for (int i=0; i<n;i++){
            for (int j=0; j<2;j++){
                a[i][j]=scn.nextInt();
            }
        }
        ArrayList ares = merge(a);
        System.out.println(ares);


    }
    public static ArrayList<Integer> merge(int[][] intervals) {
        int n = intervals.length;
        //int[][] ar=new int[n][2];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i =0;i<n;i++){

            if(i<n-1){
                if (intervals[i][1] >= intervals[i + 1][0]) {
                    ar.add(intervals[i][0]);
                    ar.add(intervals[i + 1][1]);
                    ++i;
                }
                else{
                    ar.add(intervals[i][0]);
                    ar.add(intervals[i][1]);
                }
            }
            else{
                ar.add(intervals[i][0]);
                ar.add(intervals[i][1]);
            }

        }
//        int m = ar.size()/2;
//        int[][] ar1 = new int[m][0];
//
//            for (int i = 0,k=0; i <= m && k<ar.size(); i++,k++) {
//                for (int j = 0; j < 2; j++) {
//
//                    ar1[i][j] = ar.get(k);
//                }
//            }

        return ar;

    }
}
