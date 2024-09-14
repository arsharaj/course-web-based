class Laptop {
    String brand;
    int price;

    public String toString() {
        return "Laptop [ brand = " + brand + ", price = " + price + " ]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Laptop that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        if (this.getClass() == that.getClass())
            return false;
        if (brand == null) {
            if (that.brand != null)
                return false;
        } else if (!this.brand.equals(that.brand))
            return false;
        if (price != that.price)
            return false;
        return true;
    }
}

public class ObjectClass {
    public static void main(String args[]) {
        Laptop obj1 = new Laptop();
        obj1.brand = "Lenovo Yoga";
        obj1.price = 1000;
        System.out.println(obj1);

        Laptop obj2 = new Laptop();
        obj2.brand = "Lenovo Yoga";
        obj2.price = 1000;
        System.out.println(obj2);

        boolean result = obj1 == obj2;
        result = obj1.equals(obj2);
        System.out.println(result);
    }
} 