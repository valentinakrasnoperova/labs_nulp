package lab1.task9;

import lab1.task8.CustomDouble;

public class Calculator {

    public static void calc(int a, int b, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                System.out.print("Output-" + result);
                break;

            case "-":
                result = a - b;
                System.out.print("Output-" + result);
                break;

            case "/":
                result = a / b;
                System.out.print("Output-" + result);
                break;

            case "*":
                result = a * b;
                System.out.print("Output-" + result);
                break;

            default:
                System.out.println("Wrong operator");
        }
    }
//    public  static void calc(double a, double b, String operator){
//        CustomDouble customDouble = new CustomDouble(a);
//
//    }

    }


