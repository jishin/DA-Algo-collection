package com.company;

import java.util.Scanner;

public class QuickSort {
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

        sort(arr,0,n-1);
        //Quick sort
        for(int n1 : arr){
            System.out.print(n1 + " ");
        }
        System.out.println();

    }
    static void sort(int arr[], int l, int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            sort(arr,l,pivot-1);
            sort(arr,pivot+1, h);
        }
    }
    /*static int partition(int arr[], int l, int h){
        int pivot = arr[l];
        int i=l, j=h;
        while(i<j){
            do{
                i++;

            }while(arr[i]<=pivot);
            do{
                j--;
            }while(arr[j]>pivot);

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        int temp2=arr[l];
        arr[l]=arr[j];
        arr[j]=temp2;

        return(j);
    }*/

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

}
