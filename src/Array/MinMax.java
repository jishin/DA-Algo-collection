package Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= scn.nextInt();
        System.out.println("Enter the array elements");
        int ar[] = new int[n];
        for(int i = 0; i<n;i++){
            ar[i] = scn.nextInt();
        }
        int max = findMax(ar, n);
        int min = findMin(ar, n);
        System.out.println("Max element is: "+ max);
        System.out.println("Min element is: "+ min);

    }

    static int findMax(int[] ar, int n){
        int max=ar[0];
        for(int i = 1; i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }

        }

        return max;

    }
    static int findMin(int[] ar, int n){
        int min=ar[0];
        for(int i = 1; i<n;i++){
            if(ar[i]<min){
                min=ar[i];
            }

        }

        return min;
    }
}
