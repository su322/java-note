package com.itheima.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Thread 编程比较简单，可扩展性较差，不能再继承其他类
//        Print1 p1 = new Print1();
//        Print1 p2 = new Print1();
//        Print1 p3 = new Print1();
//
//        p1.start();
//        p2.start();
//        p3.start();

//        //Runnable 编程相对复杂，不能直接使用Thread类中的方法，可扩展性强，能再继承其他类
//        Print2 p2 = new Print2();
//        Thread t2 = new Thread(p2);
//
//        //Callable 编程相对复杂，不能直接使用Thread类中的方法，可扩展性强，能再继承其他类，可以有返回值
//        Print3 p3 = new Print3();
//        FutureTask<String> ft = new FutureTask<>(p3);
//        Thread t3 = new Thread(ft);
//
////        p1.start();
////        t2.start();
//
//        t3.start();
//        String s = ft.get();
//        System.out.println(s);
        Print2 p1 = new Print2();
        Print2 p2 = new Print2();
        Print2 p3 = new Print2();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        t1.start();
        t2.start();
        t3.start();
    }
}
