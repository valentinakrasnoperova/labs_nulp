package lab1.task11;

public class Customer {
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

    Customer(String phone, String name) {
        this.phone = getPhone();
        this.name = getName();
    }

    @Override
    public String toString() {
        return "Customer" +"\n"+
                "phone is: " + phone + '\'' +
                ", name is: " + name + '\'' +
                '.';
    }
}
