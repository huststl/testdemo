package com.hust0227;

/**
 *简单插入排序算法实现
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        if(arr== null&& arr.length==0)
            return;

        for(int i=0;i<arr.length;i++){
            //假设第一个数位置时正确的；要往后移，必须要假设第一个。
            int j=i;
            int target = arr[i];

            //后移
            while(j>0 && target <arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            //插入
            arr[j] = target;
        }
    }
}
