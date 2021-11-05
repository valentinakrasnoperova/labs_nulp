package lab3.task3;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Group {
    private List<Student> students;

    public Group(final List<Student> students) {
        this.students = students;
    }

    public Student bestStudentStream() {
        return students.stream()
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public List<Student> sortingByMark() {
        return students.stream()
                .filter(e -> e.averageMark() > 3).collect(Collectors.toList());
    }

    public List<Student> sortingByName() {
        return students.stream()
                .sorted((o1, o2) -> {
                    if (!Objects.equals(o1.getSurname(), o2.getSurname()))
                        return o1.getSurname().compareTo(o2.getSurname());
                    else if (!Objects.equals(o1.getName(), o2.getName()))
                        return o1.getName().compareTo(o2.getName());
                    else return o1.getFatherName().compareTo(o2.getFatherName());
                }).collect(Collectors.toList());
    }

    public String printSurnames() {
        return students.stream()
                .map(Student::getSurname)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
    }


    @Override
    public String toString() {
        String res = "";
        for (final Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surname= " + student.getSurname();
            for (final Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }
}
