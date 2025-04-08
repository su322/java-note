package com.itheima.algorithm;

public class Jiecheng {
    public static void main(String[] args) {
        System.out.println(jiecheng(5));
    }

    //5 4: 5 * num-1
    //4 3:
    //2 1: 2 * num-1
    //1 1: 1
    public static int jiecheng(int num) {
        if(num == 1){
            return 1;
        }
        return num * jiecheng(num - 1);
    }
}
