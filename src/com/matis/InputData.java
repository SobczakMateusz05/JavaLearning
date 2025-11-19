package com.matis;

import java.util.Scanner;

public class InputData {
    public static void personalData(){
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        byte age;
        char gender;

        System.out.print("Enter your name's: ");
        name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        surname = scanner.next();
        System.out.print("Enter your age: ");
        age = scanner.nextByte();
        System.out.print("Enter your gender: ");
        gender = scanner.next().charAt(0);

        System.out.println();
        System.out.println("Your name is: " + name.trim());
        System.out.println("Your surname is: " + surname.trim());
        System.out.println("Your age is: " + age);
        System.out.println("Your gender shortcut is: " + gender);
    }
}
