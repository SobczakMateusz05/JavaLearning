package com.matis;

public class MathClass {
    public static void operations(){
        System.out.println("Round: " + Math.round(Double.parseDouble("4.6")));
        System.out.println("Ceil: " + Math.ceil(4.2));  // To nearest greater or equal number
        System.out.println("Floor: " + Math.floor(4.6)); // To nearest smaller or equal number
        System.out.println("Max: " + Math.max(1, 2));
        System.out.println("Min: " + Math.min(1,2));
        System.out.println("Random: " + Math.random());
        System.out.println("Random 1-10: " + Math.round(Math.random() * 9 + 1));
    }
}
