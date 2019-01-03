package com.dk.review.operator.equal;

public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //
        System.out.println(a == b);//true

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        System.out.println(t1 == t2);//false
    }
}
