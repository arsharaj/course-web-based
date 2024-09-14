/*** Polymorphism : many forms or behaviours
 * 1. Compile-time (Early-binding) - method overloading
 * 2. Run-time (Late-binding) - method overriding
 * 
 * Dynamic method dispatch - when the method to call is decided at the run-time
 */

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

class D {
    public void show() {
        System.out.println("In D show");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
        obj = new D();
        obj.show();
    }
}