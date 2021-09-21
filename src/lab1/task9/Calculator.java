package lab1.task9;
import lab1.task8.CustomDouble ;

public class Calculator  {

    public double calculateForInt (int a, int b, String operator) {
        switch (operator) {
            case "+" : {
                return a + b;
            }
            case "-" : {
                return a - b;
            }
            case "/": {
                if (b == 0) {
                    System.out.println("You can not divide a number by zero!");
                    return 0;
                }
                return  a / b;
            }
            case "*": {
                return a * b;
            }
            default : {
                System.out.println("You have entered the wrong operator!");
            }
        }
        return 0;
    }



    public double calculateForDouble(double a, double b, String operator) {
        CustomDouble customDouble = new CustomDouble(a);
        CustomDouble customDouble1 = new CustomDouble(b);
        switch (operator) {
            case "+" : {
                customDouble.sum(customDouble1);
                break;}
            case "-" :{
                customDouble.difference(customDouble1);
                break;}
            case "/" : {
                if (a == 0) {
                    System.out.println("You cannot divide a number by zero!");
                    return 0;
                }
            }
            case "*" : customDouble.multiplication(customDouble1);
            default : {
                System.out.println("You have entered athe wrong operator! ");
            }
        }
        return 0;
    }



    }


