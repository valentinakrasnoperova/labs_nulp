package lab1.task11;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(1234, "red", "audi");
        Driver driver = new Driver("123", "Ivan", "3 stars");
        Customer customer = new Customer("+380975643421", "Anna", "4 stars");

        Car car1 = new Car(1234, "red", "audi");
        Driver driver1 = new Driver("123", "Ivan", "3 stars");
        Customer customer1 = new Customer("+380975643421", "Anna", "4 stars");


        Order order = new Order(1, customer, car, driver);
        Order order1 = new Order(2, customer1, car1, driver1);
        System.out.println(order + "\n");
        System.out.println(order1);

    }

}

