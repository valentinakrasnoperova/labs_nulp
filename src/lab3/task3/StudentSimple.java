package lab3.task3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSimple {
    private long id;
    private String name;
    private String surname;

    public StudentSimple() {
    }

    public StudentSimple(final Student students) {
        this.name = students.getName();
        this.surname = students.getSurname();
        this.id = students.getId();
    }


    public List<StudentSimple> transformationList(final List<Student> students) {
        return students.stream()
                .map(StudentSimple::new)
                .collect(Collectors.toList());
    }
}
