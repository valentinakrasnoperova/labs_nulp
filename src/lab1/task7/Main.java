package lab1.task7;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Anna", "Ivanova", "ivanova@gmail.com", 22);
        User user2 = new User("Anna", "Ivanova", "ivanova@gmail.com", 22);
        User user3 = new User("Ivan", "Ivanov", "ivanov@gmail.com", 21);

        System.out.println(user1.equals(user2));// output : true
        System.out.println(user2.equals(user1));// output : true
        System.out.println(user1.equals(user3));// output : false
        System.out.println(user2.equals(user3));// output : false
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
    }
}

