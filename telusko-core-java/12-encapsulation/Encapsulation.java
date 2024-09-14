class Human {
    private String name;    // Accessible within the same class
    private int age;

    // Parameterless Constructor
    public Human() {
        System.out.println("In constructor");
        name = "John Doe";
        age = 12;
    }

    // Paremetrized Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}

class Encapsulation {
    public static void main(String args[]) {
        Human human1 =  new Human();
        System.out.println(human1.getName() + " " + human1.getAge());

        Human human2 = new Human("Jane Doe", 18);
        System.out.println(human2.getName() + " " + human2.getAge());
    }
}