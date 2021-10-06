package lab2.task3;

public class Student {
    private final String name;
    private final String surname;
    private final Mark mark;
    private final Subject subject;

    public Student(String name, String surname, Mark mark, Subject subject) {
        this.name=name;
        this.surname=surname;
        this.mark = mark;
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name=: " + name  +
                ", surname: " + surname +
                ", mark: " + mark +
                ", from  subject: " + subject +
                '.';
    }
}
