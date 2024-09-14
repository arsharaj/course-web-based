class DataType {
    public static void main(String args[]) {
        byte num1 = 127;
        short num2 = 10;
        int num3 = 25;
        long num4 = 4000000000000000005l;
        float num5 = 6.5f;
        double num6 = 12.05;
        char ch = '9';
        boolean status = true;
        System.out.println(status);

        int binary = 0b101;
        int hex = 0x7E;
        int seperator = 10_00_00_000;
        System.out.println(seperator);

        double conversion = 5;
        double exponents = 123e13;
        System.out.println(exponents);

        ch += 4;
        System.out.println(ch);
    }
}