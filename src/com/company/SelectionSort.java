package com.company;

import java.util.Scanner;

public class SelectionSort {
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
        System.out.println();

        sort(arr);
        //Selection sort


    }
    static void sort(int arr[]){
        int n=arr.length;
        int j=0;
        int i=0;
        int temp=0;

        for(i=0;i<n-1;i++){
            for (j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int m : arr){
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
