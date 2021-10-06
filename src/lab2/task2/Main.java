package lab2.task2;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();

        stack.push(11);
        stack.push(21);
        stack.push(33);
        stack.push(42);


        for (Node node : stack) {
            System.out.print(node.getData() + " ");
        }

        System.out.println("\n" + "The top element is " + stack.peek());
        System.out.println("Removed element: ");
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
