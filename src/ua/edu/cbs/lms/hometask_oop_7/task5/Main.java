package ua.edu.cbs.lms.hometask_oop_7.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.print("Enter a simple math expression (ex. 1+2): ");
        String mathExpression = scInput.next();

        Calculator.calc(mathExpression);

    }
}
