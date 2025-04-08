package com.itheima.algorithm;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int integers = insertSearch(arr, 9);
        System.out.println(integers);
    }

    //基本查找
    public static ArrayList<Integer> basicSearch(int[] arr, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                list.add(i);
            }
        }
        return list;
    }

    //二分查找 要求数组中的数据必须是有序的
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //插值查找 二分查找的改进 要求数组里的数据分布比较均匀 还有一种改进方式是斐波那契查找，根据黄金分割点的位置确定mid指向的位置
    public static int insertSearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (value - arr[left]) * (right - left) / (arr[right] - arr[left]);
            if (arr[mid] == value) {
                return arr[mid];
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //分块查找 包含了一块中的max和索引范围 块内无需，快间有序 块数数量一般等于数字的个数开根号
    //扩展的分块包含了一块中的min和max和索引范围 还可以扩展成哈希查找

}
