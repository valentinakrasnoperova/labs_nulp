package lab3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        User user = new User();
        Address address = new Address();

        System.out.print("Input your name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Input your surname:");
        user.setSurname(scanner.nextLine());

        System.out.print("Input your age: ");
        user.setAge(scanner.nextInt());

        System.out.print("Input your country: ");
        address.setCountry(scanner1.nextLine());

        System.out.print("Input your city: ");
        address.setCity(scanner1.nextLine());

        System.out.print("Input your street: ");
        address.setStreet(scanner1.nextLine());

        user.setAddress(address);
        user.validate();
    }
}
