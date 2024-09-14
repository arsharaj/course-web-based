enum Status {
    Running, Failed, Pending, Success;  // Objects of Status enum called named constant
}

enum Laptop {
    Macbook(2000), Xps(2200), Surface, Thinkpad(1800);

    private int price;

    // Make the constructors as private in enum because we as creating objects within the class only
    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumeration {
    public static void main(String args[]) {
        Status status = Status.Running;
        System.out.println(status);
        System.out.println(status.ordinal());
        System.out.println(status.getClass().getSuperclass());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println(s + " " + s.ordinal());
        }

        Status workStatus = Status.Success;
        if (workStatus == Status.Running) {
            System.out.println("All good ...");
        } else if (workStatus == Status.Failed) {
            System.out.println("Try again ...");
        } else if (workStatus == Status.Pending) {
            System.out.println("Please wait ...");
        } else {
            System.out.println("Done ...");
        }

        switch (workStatus) {
            case Running:
                System.out.println("<<< All good >>>");
                break;
            case Failed:
                System.out.println("<<< Try again >>>");
                break;
            case Pending:
                System.out.println("<<< Please wait >>>");
                break;
            case Success:
                System.out.println("<<< Done >>>");
                break;
            default:
                System.out.println("<<< Invalid work status >>>");
        }

        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop + " : " + laptop.getPrice());
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}