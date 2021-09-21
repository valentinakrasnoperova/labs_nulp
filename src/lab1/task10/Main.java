package lab1.task10;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Day[] days = new Day[7];

        days[0] = new Day("Mon", 21, "9%", "20%", "Sunny", 2);
        days[1] = new Day("Tue", 15, "23%", "56%", "Mostly cloudy", 12);
        days[2] = new Day("Wed", 18, "12%", "12%", "Sunny", 3);
        days[3] = new Day("Th", 9, "90%", "78%", "Rainy", 4);
        days[4] = new Day("Fr",16, "28%", "30%", "Mostly cloudy", 11);
        days[5] = new Day("St", 13, "77%", "50%", "Rainy", 3);
        days[6] = new Day("Sun", 14, "35%", "44%", "Mostly cloudy", 2);

       Arrays.stream(days).forEach(System.out::println);


    }
}
