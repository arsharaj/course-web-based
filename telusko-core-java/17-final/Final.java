/*** Final Keyword
 * 1. Variable
 * 2. Method
 * 3. Class
 */

// final class Calculator {
class Calculator {
    public final void show() {
        System.out.println("By Sam");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvancedCalculator extends Calculator {
    public void show() {
        System.out.println("By John");
    }

}

public class Final {
    public static void main(String args[]) {
        final int num = 8;
        // num = 9;
        System.out.println(num);

        Calculator calc = new AdvancedCalculator();
        calc.show();
        calc.add(2, 4);
    }
}