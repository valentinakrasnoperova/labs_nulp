package lab1.task3;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        String result = "";
        int i;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (i = 0; i < max(numbers.length, letters.length); i++) {
            if (i < numbers.length) {
                result += numbers[i];
            }
            if (i < letters.length) {
                result += letters[i];
            }
        }

        System.out.println(result);
    }
}
