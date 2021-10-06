package lab1.task2;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Dreams", "come", "true"};
        System.out.println("The number of elements is : "+count(str, 'm'));
    }

    public static int count(String[] str, char r) {
        int result = 0;
        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == r)
                    result++;
            }
        }
        return result;
    }
}
