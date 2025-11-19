package com.matis;

import java.text.NumberFormat;

public class NumberFormating {
    public static void formatOperations(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println(currency.format(1234567.91435));
        System.out.println(NumberFormat.getPercentInstance().format(0.43213));
    }
}
