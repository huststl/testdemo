package com.hust0227;

/**
 *
 *  冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length==0)
            return;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
