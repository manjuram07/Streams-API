package com.basics;

public class Demo1 {
    public static void main(String[] args) {

        String str = "12334";

        Integer integer = Integer.valueOf(str); // convert numeric string integer value
        int i = Integer.parseInt(str); // convert numeric string int value

        System.out.println(i);
        System.out.println(integer);
    }
}
