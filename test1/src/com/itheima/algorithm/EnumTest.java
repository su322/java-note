package com.itheima.algorithm;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Color c = Color.BLUE;
        Color[] colors = Color.values();
        System.out.println(c);
        System.out.println(Arrays.toString(colors));
    }

    public enum Color {
        RED, GREEN, BLUE;
    }
}
