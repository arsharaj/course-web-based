/**
 * We would have two main type of classes:
 * 1. Functional classes - that does some function
 * 2. Data Carrier classes - that are only used to contain data
 * 
 * - Variable that holds data in data carrier classes are called states.
 */

import java.util.Objects;

class A {
    private final int id;
    private final String name;

    public A (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.id + " : " + this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public boolean equals(Object that) {
        A a = (A)that;
        return id == a.id && Objects.equals(name, a.name);
    }
}

// Record Class
// Note - All the variables are private and final by default in constructor.
// Record does not extend from any other class but can implement as many interfaces as you want.
record B (int id, String name) implements Cloneable {}   // canonical constructor and compact canonical constructor

public class RecordClasses {
    public static void main(String args[]) {
        A a1 = new A(1, "Sam Miller");
        A a2 = new A(2, "Tim Cook");
        A a3 = new A(2, "Tim Cook");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a2.equals(a3));
        B b1 = new B(1, "Sam Miller");
        B b2 = new B(2, "Tim Cook");
        B b3 = new B(2, "Tim Cook");
        // B b4 = new B();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b2.equals(b3));
    }
}