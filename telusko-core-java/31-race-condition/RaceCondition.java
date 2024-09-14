/**
 * - Making something thread safe means that only one thing can work with it.
 * - join is special method that is used to wait for the other thread to come back.
 * - synchronized keyword is used to achieve concurrency.
 */

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String args[]) {
        Counter c = new Counter();
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(c.count);
    }
}