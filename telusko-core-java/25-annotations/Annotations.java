/**
 * Annotations are used to provide extra information to the compiler or run-time.
 */

@Deprecated
class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

public class Annotations {
    public static void main(String args[]) {
        B objB = new B();
        objB.show();
    }
}