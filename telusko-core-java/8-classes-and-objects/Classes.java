class Calculator {
    int num = 5;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // public double add(int num1, int num2) {
    //     return num1 + num2;
    // }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(int num1, double num2) {
        return num1 + num2;
    }
}

class Computer {
    public Computer() {
        System.out.println("Object created");
    }

    public void playMusic() {
        System.out.println("Playing music ...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

class Classes {
    public static void main(String args[]) {
        int num1 = 7;
        int num2 = 5;
        
        Calculator calc1 = new Calculator();
        double result = calc1.add(num1, num2);
        result = calc1.add(num1, num2, 5);
        result = calc1.add(num1, 4.7);
        System.out.println(result);

        Calculator calc2 = new Calculator();
        result = calc2.add(num1, num2);
        System.out.println(result);

        calc2.num = 8;
        System.out.println(calc1.num + " " + calc2.num);

        Computer computer = new Computer();
        computer.playMusic();
        String pen = computer.getMeAPen(1);
        System.out.println(pen);

        new Computer().playMusic(); // Anonymous object
    }
}