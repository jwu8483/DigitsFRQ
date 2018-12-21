package com.company;

public class Main {

    public static void main(String[] args) {
        Digits d1 = new Digits(7);
        System.out.println(d1.isStrictlyIncreasing());

        Digits d2 = new Digits(65310);
        System.out.println(d2.isStrictlyIncreasing());

        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());

        System.out.println(d2.getDigitList());
    }
}