class A {
    int age;
    
    public void show() {
        System.out.println("In A show");
    }

    // Static can only be used for inner classes
    static class B {
        public void config() {
            System.out.println("In B config");
        }
    }
}

class B {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends B {
    public void show() {
        System.out.println("In C show");
    }
}

abstract class D {
    public abstract void show();
    public abstract void config();
}

class InnerClass {
    public static void main(String args[]) {
        A a = new A();
        a.show();

        A.B ab = new A.B();
        ab.config();

        // Anonymous Inner Class
        B b = new C() {
            public void show() {
                System.out.println("In C Anonymous show");
            }
        };
        b.show();

        // Anonymous Inner Class
        D d = new D() {
            public void show() {
                System.out.println("In D Anonymous show");
            }

            public void config() {
                System.out.println("In D Anonymous config");
            }
        };
        d.show();
    }
}