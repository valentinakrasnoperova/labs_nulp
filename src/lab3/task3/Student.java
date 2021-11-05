package lab3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    static long idStatic = 0;
    private long id;
    private String name;
    private String surName;
    private String fatherName;
    private List<Subject> subject;
    private List<Mark> marks;


    public Student(final String name, final String surName, final String fatherName, final List<Subject> subject) {
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.subject = subject;
        this.marks = setMarkSubject();
        this.id = Student.idStatic++;
    }


    public long getId() {
        return id;
    }


    public List<Mark> getMarks() {
        return marks;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    String getFatherName() {
        return fatherName;
    }

    public void addMark(final int value, final String nameSubject) {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getNameSubject() == nameSubject) {
                if (value > 12 || value < 0)
                    marks.get(i).getMark().add(12);
                else
                    marks.get(i).getMark().add(value);
            }
        }
    }

    private List<Mark> setMarkSubject() {
        final List<Mark> marks = new ArrayList<>();

        for (int i = 0; i < subject.size(); i++) {
            final Mark mark = new Mark();
            marks.add(mark);
        }
        return marks;
    }

    public double averageMark() {
        double tmp = 0;
        int count = 0;

        for (final Mark mark : marks) {
            tmp += mark.getMark().stream().mapToInt(value -> value).sum();
            count += mark.getMark().stream().mapToInt(value -> value).count();
        }
        if (count != 0)
            return tmp / count;
        else
            return 0;
    }

    public List<Integer> distinctEnglish() {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getNameSubject().equals("English")) {
                return marks.get(i).getMark().stream().distinct().collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ID = " + this.getId() +
                " Name = " + this.getName() +
                " Surname = " + this.getSurName() +
                " FatherName = " + this.getFatherName();
    }
}
