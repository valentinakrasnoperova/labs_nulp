package lab3.task4;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HighLevelMultithreading {
    public static void main(final String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(()->Calculator.sum(8,9));
        executor.submit(()->Calculator.dif(16,5));

        try{
            executor.shutdown();
        } catch (final Exception e){
            executor.shutdown();
        }
    }
}
