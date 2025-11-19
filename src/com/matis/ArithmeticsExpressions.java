package com.matis;

public class ArithmeticsExpressions {
    public static void basicsOperations(){
        int sum = 1+2;
        int sub = 3-2;
        int mul = 4*5;
        double div = (double)5 / 3;

        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);
    }

    public static void shorthands(){
        int x = 0;
        int y = x++;

        System.out.println("x: " + x);
        System.out.println("y = x++: " + y);

        x = 0;
        y = ++x;

        System.out.println("y = ++x: " + y);

        x += 2;
        x -= 1;
        x *= 3;
        x /= 2;
    }
}
