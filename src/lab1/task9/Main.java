package lab1.task9;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculateForInt(10,5,"/"));
        System.out.println(calculator.calculateForInt(12,5,"*"));
        System.out.println(calculator.calculateForDouble(10.1, 5.1, "+"));
        System.out.println(calculator.calculateForDouble(10.0, 0.5, "*"));

    }
}