class A extends Object {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {
        this();
        System.out.println("In A : " + n);
    }
}

class B extends A {
    public B() {
        super();    // Implicit in every constructor
        System.out.println("In B");
    }

    public B(int n) {
        this();
        System.out.println("In B : " + n);
    }
}

class Inheritance {
    public static void main(String args[]) {
        B b1 = new B(5);
        A a1 = new A();
    }
}