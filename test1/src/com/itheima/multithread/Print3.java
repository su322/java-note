package com.itheima.multithread;

import java.util.concurrent.Callable;

public class Print3 implements Callable<String> {
    @Override
    public String call() {
        return Thread.currentThread().getName();
    }
}
