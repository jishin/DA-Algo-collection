package Array;

import java.util.Arrays;
import java.util.Scanner;

public class mergeWithOutExtraSpace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        int a[] = new int[n];
        int a1[] = new int[m];

        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        for(int i=0;i<m;i++){
            a1[i]=scn.nextInt();
        }
        merge(a, a1, n, m);
        System.out.println(a);
        System.out.println(a1);
    }
    static void merge(int arr1[], int arr2[], int n, int m) {
        int i=n-1;
        int j=0;
        for (;i>=0 && j<m;i--,j++){
            if (arr1[i]>=arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
