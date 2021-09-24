package lab1.task11;

public class Order {
    private int orderNumber;
    private Customer customer;
    private Driver driver;
    private Car car;

    public Order(int orderNumber, Customer customer, Car car, Driver driver) {
        this.orderNumber=orderNumber;
        this.customer=customer;
        this.car = car;
        this.driver=driver;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber: " + orderNumber +
                customer + driver + car +
                '}';
    }
}
