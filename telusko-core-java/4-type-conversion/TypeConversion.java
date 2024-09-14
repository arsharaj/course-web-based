class TypeConversion {
    public static void main(String args[]) {
        byte num1 = 127;
        int num2 = 256;
        int num3 = 157;
        // num1 = num2;
        num2 = num1;
        num1 = (byte) num3;
        System.out.println(num1);

        float num4 = 19.5f;
        int num5 = (int) num4;
        System.out.println(num5);

        byte a = 10;
        byte b = 30;
        int c = a * b;
        System.out.println(c);
    }
}