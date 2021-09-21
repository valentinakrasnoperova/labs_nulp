package lab1.task10;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Day[] days = new Day[7];

        days[0] = new Day(21, "9%", "20%", "Sunny", 2, "Monday");
        days[1] = new Day(15, "23%", "56%", "Mostly cloudy", 12, "Tuesday");
        days[2] = new Day(18, "12%", "12%", "Sunny", 3, "Wednesday");
        days[3] = new Day(9, "90%", "78%", "Rainy", 4, "Thursday");
        days[4] = new Day(16, "28%", "30%", "Mostly cloudy", 11, "Friday");
        days[5] = new Day(13, "77%", "50%", "Rainy", 3, "Saturday");
        days[6] = new Day(14, "35%", "44%", "Mostly cloudy", 2, "Sunday");

       Arrays.stream(days).forEach(System.out::println);


    }
}
