package lab1.task8;

public class Main {
    public static void main(String[] args) {
        final CustomDouble customDouble = new CustomDouble(-0, -0.5);
        final CustomDouble customDouble1 = new CustomDouble(4, 2.6);
        final CustomDouble customDouble2 = new CustomDouble(4, 2.6);


        System.out.println("Number 1 = " + customDouble);
        System.out.println("Number 2 = " + customDouble1);
        System.out.println("Number 3 = " + customDouble2);


        System.out.println("Sum of first and second numbers = " + customDouble.sum(customDouble1));
        System.out.println("Sum of second and third numbers = " + customDouble1.sum(customDouble2));
        System.out.println("Difference first and second numbers: " + customDouble.difference(customDouble1));
        System.out.println("Difference second and third numbers: " + customDouble1.difference(customDouble2));


        System.out.println("Comparison of first end second: ");
        customDouble.comparison(customDouble1);
        System.out.println("Comparison of second end third: ");
        customDouble1.comparison(customDouble2);


        System.out.println(customDouble.equals(customDouble1));
        System.out.println(customDouble1.equals(customDouble2));
        System.out.println(customDouble.hashCode());
        System.out.println(customDouble1.hashCode());
        System.out.println(customDouble2.hashCode());

    }
}