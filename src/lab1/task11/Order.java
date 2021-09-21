package lab1.task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    List<Customer> listOfCustomers;
    List<Driver> listOfDrivers;
    List<Car> listOfCars;


    Order() {
        listOfCustomers = new ArrayList<>();
        listOfDrivers = new ArrayList<>();
        listOfCars = new ArrayList<>();
    }


    void addNewDriver(String ID, String name) {
        listOfDrivers.add(new Driver(ID, name));
    }

    void addNewCustomer(String phone, String name) {
        listOfCustomers.add(new Customer(phone, name));
    }

    void addNewCar(int number, String color, String brand) {
        listOfCars.add(new Car(number, color, brand));
    }

    @Override
    public String toString() {
        return "Order:" + "\n" +
                "listOfCustomers: " + "\n" + listOfCustomers +
                ", listOfDrivers: " + "\n" + listOfDrivers +
                ", listOfCars: " + "\n" + listOfCars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(listOfCustomers, order.listOfCustomers) && Objects.equals(listOfDrivers, order.listOfDrivers) && Objects.equals(listOfCars, order.listOfCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfCustomers, listOfDrivers, listOfCars);
    }
}