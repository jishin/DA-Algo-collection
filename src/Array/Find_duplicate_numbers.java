package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Find_duplicate_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int res = findDuplicate(a);
        System.out.println(res);
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
