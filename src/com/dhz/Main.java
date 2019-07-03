package com.dhz;

public class Main {

    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b.intValue();
        b = temp;
    }

    public static void main(String[] args) {
	// write your code here
        int a = 1;
        int b = 2;
        Main.swap(a, b);
        System.out.println("a:" + a + "b:" + b);
    }
}
