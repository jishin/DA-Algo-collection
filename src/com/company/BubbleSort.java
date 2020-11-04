package com.company;

import java.util.Scanner;

public class BubbleSort {
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
        //Bubble sort
    }
    static void sort(int arr[]){
        int n=arr.length;
        int temp=0;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int m : arr){
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static int[] sort2(int arr[]){
        int n=arr.length;
        int temp=0;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        return arr;
    }
}
