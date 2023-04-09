package ua.edu.cbs.lms.hometask_oop_7.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        Corporation corporation = new Corporation();
        char key;
        do{
            System.out.println("Would you like enter the worker? (y/n): ");
            key = scInput.next().toLowerCase().charAt(0);
            while (!corporation.addWorker());
        }while (key != 'n');



//        Соколова Анастасія Миколаївна
//        Петренко Денис Олександрович
//        Коваленко Ірина Сергіївна
//        Мельник Віталій Васильович
//        Бондаренко Юлія Олегівна
    }
}
