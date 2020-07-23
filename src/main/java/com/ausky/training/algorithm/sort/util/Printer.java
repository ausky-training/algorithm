package com.ausky.training.algorithm.sort.util;

/**
 * 打印器
 */
public class Printer {
    public static void print(int[] targetArr) {
        StringBuilder str = new StringBuilder();
        for (int i : targetArr) {
            str.append(i).append(",");
        }
        System.out.println(str.substring(0, str.length() - 1));
    }
}
