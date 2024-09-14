class Loops {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Sam " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

        i = 5;
        do {
            System.out.println("Hello " + i);
            i++;
        } while (i <= 5);
        System.out.println("Bye " + i);

        for (i = 0; i < 5; i++) {
            System.out.println("Hello Michael " + i);
        }

        for (i = 1; i <= 5; i++) {
            System.out.println("Day " + i);
            for (int j = 9; j <= 18; j++) {
                if (j < 12) {
                    System.out.println(j + " am");
                } else {
                    System.out.println(j + " pm");
                }
            }
        }
    }
}