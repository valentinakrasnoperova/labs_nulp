package lab3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Subject math = new Subject("Math");
        final Subject english = new Subject("English");
        final Subject physics = new Subject("Physics");
        final Subject ukrainian = new Subject("Physic");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(math);
        subjects.add(english);
        subjects.add(physics);
        subjects.add(ukrainian);


        final Student student1 = new Student("Anna", "Krasnova", "Ivanova", subjects);
        final Student student2 = new Student("Ivan", "Ivanov", "Ruslanov", subjects);
        final Student student3 = new Student("Max", "Petrov", "Bohdanov", subjects);
        final Student student4 = new Student("Alla", "Petrova", "Alexandrova", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.transformed(students);

        students.get(0).addMark(4, "Math");
        students.get(1).addMark(2, "Math");
        students.get(2).addMark(5, "Math");
        students.get(3).addMark(5, "Math");

        students.get(0).addMark(4, "English");
        students.get(1).addMark(3, "English");
        students.get(2).addMark(5, "English");
        students.get(3).addMark(5, "English");

        students.get(0).addMark(3, "Physics");
        students.get(1).addMark(5, "Physics");
        students.get(2).addMark(2, "Physics");
        students.get(3).addMark(5, "Physics");

        students.get(0).addMark(4, "Ukrainian");
        students.get(1).addMark(2, "Ukrainian");
        students.get(2).addMark(5, "Ukrainian");
        students.get(3).addMark(5, "Ukrainian");

        System.out.println("Average mark is:");
        System.out.println(student1.averageMark());

        System.out.println(student1.distinctEnglish());

        final Group group = new Group(students);
        System.out.println("Best student: ");
        System.out.println(group.bestStudentStream());

        System.out.println("Sorted without 3: ");
        System.out.println(group.sortingByMark());

        System.out.println("Sorted: ");
        System.out.println(group.sortingByName());

        System.out.println("Students' surnames: ");
        System.out.println(group.printSurnames());

    }
}
