/**
 * Functional interfaces are very useful when used with lambda expression.
 * In fact lambda expressions are used with functional interfaces specifically.
 * Lambda expressions does not need argument types but anonymous classes do.
 * Lambda expressions also reduces the number of class files.
 * We can also pass lambda expressions as function arguments.
 */

@FunctionalInterface
interface A {
    void show(int i);
    // void run();
}

@FunctionalInterface
interface Addition {
    int add(int i, int j);
}

public class SamInterface {
    public static void main(String args[]) {
        A obj1 = new A() {
            public void show(int i) {
                System.out.println("In A show : " + i);
            }
        };
        obj1.show(5);

        // Lambda Expression
        A obj2 = (i) -> {
            System.out.println("In lambda A show : " + i);
        };
        obj2.show(3);

        A obj3 = i -> System.out.println("In single lambda A show : " + i);
        obj3.show(1);

        Addition addition1 = new Addition() {
            public int add(int i, int j) {
                return i + j;
            }
        };
        int result1 = addition1.add(4, 6);
        System.out.println(result1);

        Addition addition2 = (i, j) -> {
            return i + j;
        };
        int result2 = addition2.add(1, 6);
        System.out.println(result2);

        Addition addition3 = (i, j) -> i + j;
        int result3 = addition3.add(1, -6);
        System.out.println(result3);
    }
}