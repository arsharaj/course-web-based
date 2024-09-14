class Mobile {
    static String name; // Shared among objects

    String brand;
    double price;

    // Static initializer - while class loading
    static {
        name = "Phone";
        System.out.println("In static block");
    }

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }


    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void display() {
        System.out.println("In static method");
        // System.out.println(brand);  // Non static variable
    }

    public static void display(Mobile mobile) {
        System.out.println(mobile.brand);
    }
}

class Static {
    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("Mobile");

        System.out.println(Mobile.name);

        Mobile apple = new Mobile();
        apple.brand = "Apple";
        apple.price = 1500;
        apple.name = "Smart Phone";

        Mobile samsung = new Mobile();
        samsung.brand = "Samsung";
        samsung.price = 1700;
        samsung.name = "Phone";

        Mobile.name = "Smart Mobiles";

        Mobile empty = new Mobile();

        apple.show();
        samsung.show();
        empty.show();

        // Mobile.display();
        Mobile.display(apple);
    }
}