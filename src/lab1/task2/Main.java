package lab1.task2;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Va", "v", "v", "v", "vv", "v", "", "v", "a"};
        int count = 0;
        for (String str : names) {
            count += str.length();
        }
        System.out.println("Total number is:" + count);
    }
}
