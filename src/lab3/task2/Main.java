package lab3.task2;

public class Main {
    public static void main(String[] args) {
        try (MyResource myResource1 = new MyResource()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
