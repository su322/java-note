package com.itheima.algorithm;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 2, 6, 4, 9, 8};
//        BubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
        QuickSort(arr, 0, arr.length - 1);
//        PrintArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void PrintArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //冒泡排序
    public static void BubbleSort(int[] arr) {
        //-1为了防止索引越界，-i为了提高效率
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    //选择排序 和冒泡比较像 i表示每一轮拿i去和后面的比较
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    //插入排序 将0索引到N索引的元素看作是有序的，把N+1索引的元素到最后一个当成是无序的，遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面
    public static void InsertionSort(int[] arr) {
        int startIndex = -1;

        //找到无序的数据是从哪一个索引开始的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        //遍历从startIndex开始的数据
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        PrintArray(arr);
    }

    //快速排序
    public static void QuickSort(int[] arr, int i, int j) {
        int left = i, right = j;//i,j不动

        //递归结束条件
        if (left >= right) {
            return;
        }

        int base = arr[left];//基准数，必须在结束条件后面

        while (left < right) {//直到左右指针相遇
            //利用right，从后往前找比基准数小的
            while (left < right && arr[right] >= base) {//还没找到准备交换的就不停
                right--;
            }
            //利用left，从前往后找比基准数大的
            while (left < right && arr[left] <= base) {//还没找到准备交换的就不停
                left++;
            }
            //交换左右指针所指的值
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        //左右指针相遇，基准数归位
        arr[i] = arr[left];
        arr[left] = base;

        //递归处理左右子数组
        QuickSort(arr, i, left - 1);
        QuickSort(arr, left + 1, j);
    }
}
