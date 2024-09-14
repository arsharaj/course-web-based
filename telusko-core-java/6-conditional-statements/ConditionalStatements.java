class ConditionalStatements {
    public static void main(String args[]) {
        int x = 18;
        if (x > 10 && x <= 20) {
            System.out.println("Hello World");
        } else {
            System.out.println("Bye");
        }

        int a = 8;
        int b = 7;
        int c = 9;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        int num = 4;
        boolean result = num % 2 == 0 ? true : false;
        System.out.println(result);

        int day = 9;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
    }
}