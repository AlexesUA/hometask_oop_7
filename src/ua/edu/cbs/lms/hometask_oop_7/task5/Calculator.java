package ua.edu.cbs.lms.hometask_oop_7.task5;

public class Calculator {

    public static class ErrorHandling{
        public static void printError(Exception error){
            System.out.println(error.getMessage());
        }
    }
    public static double summary(double arg1, double arg2){
        try {
            return arg1 + arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    public static double subtraction(double arg1, double arg2){
        try {
            return arg1 - arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    public static double multiply(double arg1, double arg2){
        try {
            return arg1 * arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    public static double divide(double arg1, double arg2){
        try {
            return arg1 / arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }
}
