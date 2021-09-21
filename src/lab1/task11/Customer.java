package lab1.task11;

public class Customer extends Order {
    private String phone;
    private String name;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Customer(int orderNumber, String phone, String name) {
        super(orderNumber);
        this.phone = phone;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer" +"\n"+"order number : "+orderNumber+
                ", phone is: " + phone + '\'' +
                ", name is: " + name + '\'' +
                '.';
    }
}
