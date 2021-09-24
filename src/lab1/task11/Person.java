package lab1.task11;

import java.util.Objects;

public class Person {
    String name;
    String appRate;

    public Person(String name, String appRate) {
        this.name = name;
        this.appRate = appRate;
    }

    public Person(String name) {
    }

    public String getAppRate() {
        return appRate;
    }

    public void setAppRate(String appRate) {
        this.appRate = appRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getAppRate(), person.getAppRate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAppRate());
    }
}
