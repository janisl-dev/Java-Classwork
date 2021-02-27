package com.rcs.classwork.Day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet a: ");
        float a = scanner.nextFloat();
        System.out.print("Ievadiet b: ");
        float b = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ievadiet darbību (+, -,*,/): ");
        String action = scanner.nextLine();
        System.out.println(action);
        scanner.close();

        switch(action) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Nepareizs formāts");
        }
    }
}
