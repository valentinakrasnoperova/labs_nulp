package lab2.task4;


public class Student {
    final private String id;
    private final String nameSurname;

    public String getId() {
        return id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public Student(String id, String nameSurname) {
        this.id = id;
        this.nameSurname = nameSurname;
    }
}
