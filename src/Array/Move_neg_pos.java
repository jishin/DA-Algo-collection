/*
* Examples :

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
Note: Order of elements is not important here.

* */


package Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Move_neg_pos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n;i++){
            ar[i]=scn.nextInt();
        }
        List<Integer> listp = new ArrayList<Integer>();
        List<Integer> listn = new ArrayList<Integer>();
        for(int i = 0; i<n;i++){
            if(ar[i]>=0){
                listp.add(ar[i]);
            }
            else{
                listn.add(ar[i]);
            }
        }
        listn.addAll(listp);
        for(int k= 0; k<listn.size();k++){
            System.out.print(listn.get(k) + " ");

        }


    }
}
