public class WrapperClasses {
    public static void main(String args[]) {
        int num1 = 7;
        // Integer num2 = new Integer(8);   // Boxing
        Integer num3 = 9;   // Auto-boxing
        int num4 = num3.intValue(); // Unboxing
        int num5 = num3;    // Auto-unboxing
        System.out.println(num5);

        String str = "12";
        int num6 = Integer.parseInt(str);
        System.out.println(num6 * 2);
    }
}