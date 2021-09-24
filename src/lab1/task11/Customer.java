package lab1.task11;

public class Customer extends Person {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    Customer(String phone, String name, String appRate) {
        super(name, appRate);
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n" + "Client:" + "\n" +
                "phone number" + phone + ", name: " + name + ", appRate: " + appRate;
    }
}
