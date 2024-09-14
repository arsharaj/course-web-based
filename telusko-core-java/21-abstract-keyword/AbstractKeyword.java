abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

// Concrete class
class Wagon extends Car {
    public void drive() {
        System.out.println("Driving");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

public class AbstractKeyword {
    public static void main(String args[]) {
        Car car = new Wagon();
        car.drive();
        car.fly();
        car.playMusic();
    }
}