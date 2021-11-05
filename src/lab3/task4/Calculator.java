package lab3.task4;

public class Calculator implements AutoCloseable {
    public static void sum(final int a, final int b) {
        System.out.println("sum is: ");
        System.out.println(a + b);
    }

    public static void dif(final int a, final int b) {
        System.out.println("difference is:");
        System.out.println(a - b );
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed MyResource");
    }
}
