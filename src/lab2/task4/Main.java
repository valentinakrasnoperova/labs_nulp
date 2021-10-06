package lab2.task4;


public class Main {
    public static void main(String[] args) {
        final StudentList studentList = new StudentList(new String[]{"Physics", "Math", "English"});
        final Student student1 = new Student("123", "Ivan Ivanov");
        final Student student2 = new Student("124", "Masha Petrova");

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        studentList.setMark("Physics", "123", 5);
        studentList.setMark("Physics", "124", 3);
        studentList.setMark("Math", "123", 3);
        studentList.setMark("Math", "124", 2);
        studentList.setMark("English", "123", 3);
        studentList.setMark("English", "124", 4);

        studentList.addSubject("History");
        studentList.setMark("History", "123", 5);
        studentList.setMark("History", "124", 5);

        System.out.println("All students info: ");
        studentList.fetchAllStudents();
        System.out.println();

        System.out.println("Best student : ");
        studentList.getBestStudent();
        System.out.println();

        System.out.println("English map: ");
        System.out.println(studentList.getMarks("English"));


    }
}
