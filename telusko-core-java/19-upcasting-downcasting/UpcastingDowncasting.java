class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class UpcastingDowncasting {
    public static void main(String args[]) {
        double num1 = 4.5;
        int num2 = (int) num1;
        System.out.println(num2);
        
        A obj1 = new A();
        obj1.show1();
        A obj2 = new B();
        obj2.show1();
        // obj2.show2();
        B obj3 = (B) obj2;
        obj3.show2();
    }
}