package ua.edu.cbs.lms.hometask_oop_7.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        Corporation corporation = new Corporation();
        char key;
        do{
            System.out.print("Would you like enter the worker? (y/n): ");
            key = scInput.nextLine().toLowerCase().charAt(0);
            while (!corporation.addWorker());
        }while (key != 'n');

        corporation.printWorkerOfExperience(0);
        System.out.println(" = = = = ");
        corporation.printWorkerOfExperience(10);

//        Соколова Анастасія Миколаївна
//        Петренко Денис Олександрович
//        Коваленко Ірина Сергіївна
//        Мельник Віталій Васильович
//        Бондаренко Юлія Олегівна
    }
}
