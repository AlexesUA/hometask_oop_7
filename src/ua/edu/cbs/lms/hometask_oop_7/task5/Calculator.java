package ua.edu.cbs.lms.hometask_oop_7.task5;

public class Calculator {

    private static double arg1;
    private static double arg2;
    private static char mathOperation;

    public static class ErrorHandling{
        public static void printError(Exception error){
            System.out.println(error.getMessage());
        }
    }
    private static double summary(double arg1, double arg2){
        try {
            return arg1 + arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    private static double subtraction(double arg1, double arg2){
        try {
            return arg1 - arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    private static double multiply(double arg1, double arg2){
        try {
            return arg1 * arg2;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    private static double divide(double arg1, double arg2){
        try {
            if(arg2 == 0) throw new Exception("Divide by zero.");
            else return arg1 / arg2;
        }
        catch (ArithmeticException mathError){
            ErrorHandling.printError(mathError);
            return 0;
        }
        catch (Exception error){
            ErrorHandling.printError(error);
            return 0;
        }
    }

    public static void calc(String mathExpression){
        try {
            if (mathExpression.contains("+")) {
                mathOperation = '+';
                parse(mathExpression);
                System.out.printf("Result %1$s %2$s %3$s = %4$s \n",arg1, mathOperation, arg2, summary(arg1,arg2));
            } else if (mathExpression.contains("-")) {
                mathOperation = '-';
                parse(mathExpression);
                System.out.printf("Result %1$s %2$s %3$s = %4$s \n",arg1, mathOperation, arg2, subtraction(arg1,arg2));
            } else if (mathExpression.contains("*")) {
                mathOperation = '*';
                parse(mathExpression);
                System.out.printf("Result %1$s %2$s %3$s = %4$s \n",arg1, mathOperation, arg2, multiply(arg1,arg2));
            } else if (mathExpression.contains("/")) {
                mathOperation = '/';
                parse(mathExpression);
                System.out.printf("Result %1$s %2$s %3$s = %4$s \n",arg1, mathOperation, arg2, divide(arg1,arg2));
            } else{
                throw new Exception("Unknown math operation.");
            }

        }catch (Exception error){
            ErrorHandling.printError(error);
        }
    }

    private static void parse(String mathExpression){
        try {
            arg1 = Double.parseDouble(mathExpression.substring(0,mathExpression.indexOf(mathOperation)));
            arg2 = Double.parseDouble(mathExpression.substring(mathExpression.indexOf(mathOperation)+1));

        }catch (Exception error){
            ErrorHandling.printError(error);
        }
    }




}
