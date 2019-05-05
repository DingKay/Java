package com.dk.basis.operator.equal;

/**
 * @author DingKai
 * @Classname ComparisonOperator
 * @Description TODO
 * @create 2019/1/23
 */
public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        // true
        System.out.println(a == b);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        // false
        System.out.println(t1 == t2);

        /*
         * this '==' in Integer between -128 to 127 then true
         * if not this interval then false;
         * the following is wrong example
         */
        /*Integer common = 127;
        Integer commoz = 127;
        System.out.println(common == commoz);

        Integer special = 128;
        Integer speciaz = 128;
        System.out.println(special == speciaz);*/

        Integer common = 127;
        Integer commoz = 127;
        System.out.println(common.equals(commoz));

        Integer special = 128;
        Integer speciaz = 128;
        System.out.println(special.equals(speciaz));

        /*
         * note this order;
         * if this example equals 'null',then will throws NullPointerException
         */
        Integer example = null;
        /*
         * the following is wrong example
         */
        try {
            System.out.println(example.equals(1));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("1".equals(example));
    }
}
