/**
 * - To support threads our OS should be multi-tasking.
 * - Every thread class must have a run method.
 * - Scheduler in the OS decides that which thread should be executed.
 * - Priority : 1 - least priority and 10 - maximum priority
 * - We can make the Thread wait using sleep(ms) method.
 * - To create threads we have multiple ways:
 * 1. Extend the Thread class and implement the run method.
 *    - the start() method will implicitly call run() method from the class.
 *    - But now we could not extend any other class.
 * 2. Implement the Runnable interface
 *    - Create a Runnable task and pass it as method to Thread object.
 *    - Then use start() to call the run() method of respective class.
 *    - Also use lambda expression to make the code concise.
 * 
 * Note: Mutation means you can change something.
 * - Different problem arises when you use mutation with threads.
 * 
 * - Different states of thread:
 * 1. New - Creating new thread
 * 2. Runnable - Using the start method
 * 3. Running - When the thread is actually executing in CPU using run method
 * 4. Waiting / Blocked - Thread comes to this state via wait or sleep method
 *                        and goes back to runnable state via notify method
 * 5. Dead - Done via deprecated stop method
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Namaste");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Threads {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.run();
        System.out.println("--------------");
        Runnable task1 = new C();
        Runnable task2 = new B();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        System.out.println("--------------");

        // Using lambda expression
        Runnable task3 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Bonjour");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task4 = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hola");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);
        t3.start();
        t4.start();
    }
}