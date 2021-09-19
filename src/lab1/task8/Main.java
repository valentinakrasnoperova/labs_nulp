package lab1.task8;

public class Main {
    public static void main(final String[] args) {
        final CustomDouble num1 = new CustomDouble(-3, -0.5);
        final CustomDouble num2 = new CustomDouble(5, 1.7);
        final CustomDouble num3 = new CustomDouble(5, 1.7);


        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
        System.out.println("Number3: " + num3);
        System.out.println("Sum: " + num1.sum(num2));
        System.out.println("Difference: " + num1.difference(num2));

        num1.comparison(num2);
        num2.comparison(num1);
        num3.comparison(num2);
        System.out.println(num1.equals(num2));
        System.out.println(num2.equals(num1));
        System.out.println(num2.equals(num3));
        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());
        System.out.println(num3.hashCode());
    }
}
