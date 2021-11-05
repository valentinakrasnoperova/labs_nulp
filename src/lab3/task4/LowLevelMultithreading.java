package lab3.task4;

public class LowLevelMultithreading {
    public static void main(final String[] args) {

        final SimpleThread1 simpleThread1 = new SimpleThread1();
        final SimpleThread2 simpleThread2 = new SimpleThread2();

        simpleThread1.start();
        simpleThread2.start();

    }
    public static class SimpleThread1 extends Thread{
        @Override
        public void run() {
            Calculator.sum(14,5);
        }
    }
    public static class SimpleThread2 extends Thread{
        @Override
        public void run() {
            Calculator.dif(12,13);
        }
    }

}
