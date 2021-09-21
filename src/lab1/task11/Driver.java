package lab1.task11;

public class Driver {
    private String ID;
    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Driver(String ID, String name) {
        this.ID = getID();
        this.name = getName();
    }

    @Override
    public String toString() {
        return "Driver: " +
                "ID: " + ID + '\'' +
                ", name: " + name + '\'' +
                '.';
    }
}
