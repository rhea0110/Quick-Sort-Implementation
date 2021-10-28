package com.company;

public class Main {


    public static void main(String[] args) {
        int[] arr = {23, -11, 13, 0, -4, 100};
        int size = arr.length;

        quickSort(arr, 0, size);


        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }


    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arr[--j] >= pivot) ;
            if (i < j) {
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] <= pivot) ;
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}