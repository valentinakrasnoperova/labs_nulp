package lab1.task7;

public class User {
    public String firstName;
    public String lastName;
    public String email;
    public int age;

    public User(String firstName, String lastName, String email, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        User guest = (User) obj;
        return age == guest.age
                && (firstName == guest.firstName
                || (firstName != null && firstName.equals(guest.getFirstName()))) && (lastName == guest.lastName
                || (lastName != null && lastName.equals(guest.getLastName()) && (email == guest.email
                || (email != null && email.equals(guest.getEmail())
        ))));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result +
                ((email == null) ? 0 : email.hashCode());
        result = prime * result + age;
        return result;
    }
}

