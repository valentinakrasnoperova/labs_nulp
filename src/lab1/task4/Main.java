package lab1.task4;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            } else {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }

            }
            System.out.print("\n");
            i++;

        }
    }
//second way using ternary operator

//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i);
//            i++;
//        }
//    }


}


