package com.itheima.multithread;

public class Print1 extends Thread {
    static int ticket = 0;
    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }
        while (true) {
            synchronized (Print1.class) {
                if (ticket == 100) {
                    break;
                }
                else {
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "  " + ticket);
                }
            }
        }
    }
}
