package lab2.task4;

import java.util.*;

import static java.util.Collections.addAll;

public class StudentList {
    private List<String> subjects;
    private List<Student> students;
    private final HashMap<String, HashMap<String, Integer>> map;

    public StudentList(String[] subjects) {
        this.subjects = new ArrayList<>();
        this.students = new ArrayList<>();
        addAll(this.subjects, subjects);
        this.map = new HashMap<>();
        for (String subject : subjects) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setMark(String subject, String id, int mark) {
        HashMap<String, Integer> nestedMap = map.get(subject);
        if (nestedMap == null) {
            nestedMap = new HashMap<>();
            map.put(subject, nestedMap);
        }
        nestedMap.put(id, mark);
    }

    public int getMark(String subject, String id) {
        HashMap<String, Integer> nestedMap = map.get(subject);
        if (nestedMap == null) {
            nestedMap = new HashMap<>();
            map.put(subject, nestedMap);
        }
        Integer mark = nestedMap.get(id);
        if (mark == null) {
            return 0;
        }
        return mark;
    }

    public Map<String, Integer> getMarks(String subject) {
        return map.get(subject);
    }

    public void fetchAllStudents() {
        for(Student student: students) {
            System.out.print(student.getId() + ": "+ student.getNameSurname()+ ", ");
            subjects.stream().map(subject -> subject + ": " + getMark(subject, student.getId()) + " ").forEach(System.out::print);
            System.out.println();
        }
    }

    private int getMarksSum(String id) {
        int result = 0;
        for (String subject : subjects) {
            result += getMark(subject, id);
        }
        return result;
    }
    public String getBestStudentId() {
        int currentMax=-1;
        int currentSum;
        Student bestStudent = null;

        for (Student student : students) {
            currentSum = getMarksSum(student.getId());
            if (currentSum > currentMax) {
                currentMax = currentSum;
                bestStudent = student;
            }
        }
        return bestStudent.getId();
    }

    public void getBestStudent() {
        final String bestStudentId = getBestStudentId();
        System.out.print(bestStudentId + ": ");
        subjects.stream().map(subject -> subject + "=" + getMark(subject, bestStudentId) + " ").forEach(System.out::print);
        System.out.println();
    }


}