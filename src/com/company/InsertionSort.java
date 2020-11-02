package com.company;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the no of elements");
        int n=scn.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int m : arr){
            System.out.print(m + " ");
        }

        //insertion sort
        int temp=0;
        for(int j=1;j<n;j++){
            for(int k=0;k<j;k++){
                if(arr[j]<arr[k]){
                    temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int l : arr){
            System.out.print(l + " ");
        }
    }
}
