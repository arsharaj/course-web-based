class A {
    public void show() {
        System.out.println("In A show");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    // Method overriding
    public void show() {
        System.out.println("In B show");
    }
}

class Overriding {
    public static void main(String args[]) {
        A obj1 = new A();
        obj1.show();

        B obj2 = new B();
        obj2.show();
        obj2.config();
    }
}