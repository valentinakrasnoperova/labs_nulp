package lab1.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Valiaaaaaaaa", "vaal", "Valia", "val", "Vaaaaaaalia", "Valiaa", "Valiiaa", "V", "valiiiaaaa"};
        for (String str : names) {
            System.out.println(str);
        }
        Arrays.sort(names, Comparator.comparing(String::length));
        System.out.println("\nSORTED:\n");
        for (String str : names) {
            System.out.println(str);
        }
    }
}