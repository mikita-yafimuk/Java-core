package core.other;

/**
 * Created by USER on 10/17/2017
 */

public class Calculator {

    /*
    * this method gets String value and returns double number if it possible
    * if not - it returns NaN
    */
    private static double getNumber(String value) {
        try {
            return Double.valueOf(value);
        } catch (NumberFormatException ex) {
            System.out.println("'" + value + "'" + " is not a number");
            return Double.NaN;
        }
    }

    /*
    * this method shows result of operation(+ || - || * || /) on the screen
    * between two variables firstNumber and secondNumber
    *
    * operation - it is operation which should be done
    */
    private static void calculate(double firstNumber, String operation, double secondNumber) {
        switch (operation) {
            case "+":
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Result: " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("You should write next operations: +, -, *, /");
                break;
        }
    }

    public static void main(String[] args) {
        double firstNumber = getNumber(args[0]);
        String operation = args[1];
        double secondNumber =  getNumber(args[2]);

        calculate(firstNumber , operation, secondNumber);
    }
}

