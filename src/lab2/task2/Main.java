package lab2.task2;


public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();

        stack.push(11);
        stack.push(21);
        stack.push(33);
        stack.push(42);

        stack.forEach(System.out::println);

        System.out.println("The top element is " + stack.peek());
        System.out.println("Removed element: ");
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
