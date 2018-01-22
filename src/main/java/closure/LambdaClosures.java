package closure;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaClosures {

    public static void main(String[] args){
        Consumer closures = LambdaClosures::printNames; 
        closures.accept("Sankar");
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello " + threadName + " ");
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

        fn();
    }

    private static void printNames(Object o) {
        System.out.println(o.toString());
    }

    private static void fn() {
        int var = 42;
        Supplier<Integer> lambdaFun = () -> var;
        System.out.println(lambdaFun.get());
    }


}
