/*

abstract class Computer {
    abstract public void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("Coding Compile Run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Coding Compile Run : Faster");
    }
}

class Developer {
    // Developer is loosely coupled with Computer
    public void devApp(Computer computer) {
        computer.code();
        System.out.println("Develop applications");
    }
}

*/

// Interfaces are used to avoid abstract classes that contain only abstract methods
// Multiple interfaces can be implemented and only one abstract class can be extended
// Methods in interface - public abstract
// Variables in interface - public static final

/**
 * class - class => extends
 * class - interface => implements
 * interface - interface => extends
 */

interface Computer {
    double PI = 3.14;  // public static final
    String NAME = "Computer";
    void code();    // public abstract by default
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding Compile Run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding Compile Run : Faster");
    }
}

class Developer {
    // Developer is loosely coupled with Computer
    public void devApp(Computer computer) {
        computer.code();
        System.out.println("Develop applications");
    }
}

interface X {
    void run();
}

// Inheritance in interfaces
interface Y extends X {

}

public class Interfaces {
    public static void main(String args[]) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer1 = new Developer();
        developer1.devApp(laptop);
        developer1.devApp(desktop);
        System.out.println(Computer.PI);
    }
}