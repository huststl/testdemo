package com.hust0227;

/**
 * 选择排序
 */
public class SelectSort {
    public static void selectSort(int[] arr){
        if(arr==null&&arr.length==0)
            return;
        int mixIndex = 0;
        for(int i=0;i<arr.length;i++){//只需要比较n-1次
            mixIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mixIndex])
                    mixIndex = j;
            }
            if(mixIndex!=i){
                swap(arr,i,mixIndex);
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
