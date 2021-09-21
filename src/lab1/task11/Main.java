package lab1.task11;


public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Order order1 = new Order();
        Order order2 = new Order();

        order.addNewDriver("123", "Ivan");
        order.addNewCar("123", 3456, "red", "BMW");
        order.addNewCustomer(1, "0976785432", "Anna");

        order1.addNewDriver("123", "Ivan");
        order1.addNewCar("123", 9990, "white", "BMW");
        order1.addNewCustomer(2, "098765443", "Valia");

        order2.addNewDriver("456", "Ruslan");
        order2.addNewCar("456", 9990, "white", "BMW");
        order2.addNewCustomer(3, "0976788882", "Masha");

        System.out.println(order);
        System.out.println(order1);
        System.out.println(order2);
    }

}

