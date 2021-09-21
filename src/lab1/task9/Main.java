package lab1.task9;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculateForInt(2,3,"+"));
        System.out.println(calculator.calculateForInt(10,5,"/"));
        System.out.println(calculator.calculateForDouble(1.2, 0.3, "+"));
    }
}