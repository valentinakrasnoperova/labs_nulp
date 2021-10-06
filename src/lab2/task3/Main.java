package lab2.task3;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject("Math");
        Subject subject1 = new Subject("English");

        Mark mark = new Mark("97 points");
        Mark mark1 = new Mark("99 points");

        Student student = new Student("Alex", "Grabe", mark, subject);
        Student student1 = new Student("Anna", "Grabe", mark1, subject);
        Student student2 = new Student("Max", "Grabe", mark1, subject1);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

    }






}
