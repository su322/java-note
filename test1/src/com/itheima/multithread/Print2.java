package com.itheima.multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Print2 implements Runnable {
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "  " + ticket);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
