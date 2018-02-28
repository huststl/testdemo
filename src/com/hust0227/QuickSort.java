package com.hust0227;

/**
 * 快速排序
 */
public class QuickSort {

    public static int partition(int[] arr,int left,int right){
        int pivotKey = arr[left];

        while(left < right){
            while(left<right && arr[right] >= pivotKey)
                right -- ;
            arr[left] = arr[right];//把小的移动到左边
            while(left<right && arr[left]<=pivotKey)
                left++;
            arr[right] = arr[left];//把大的移动到右边
        }
        arr[left] = pivotKey; //最后把pivot赋值到中间
        return left;
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right)
            return;
        int pivotPos = partition(arr,left,right);
        quickSort(arr,left,pivotPos-1);
        quickSort(arr,pivotPos+1,right);
    }
    public static void sort(int[] arr){
        if(arr==null || arr.length ==0)
            return;
        quickSort(arr,0,arr.length-1);
    }
}
