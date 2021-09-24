package lab1.task1;

public class Main {
    public static void main(String[] args) {
        final String[] names = {"Valiaaaaaaaa", "vaal", "Valia", "val", "Vaaaaaaalia", "Valiaa", "Valiiaa", "V", "valiiiaaaa"};
        sort(names);
        for (String s : names) {
            System.out.println(s);
        }

    }

    public static void sort(String[] arr) {
        int j, i;
        String tmp;
        for (i = 1; i < arr.length; i++) {
            tmp = arr[i];
            for (j = i - 1; j >= 0 && tmp.length() > arr[j].length(); j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tmp;
        }

    }
}