class Calculator {
    public static void main(String args[]) {
        BasicCalculator basicCalc = new BasicCalculator();
        int result1 = basicCalc.add(4, 5);
        int result2 = basicCalc.sub(9, 3);
        System.out.println(result1 + " " + result2);

        EnhancedCalculator enhancedCalc = new EnhancedCalculator(); // Single-level inheritance
        int result3 = enhancedCalc.mul(-5, 7);
        int result4 = enhancedCalc.div(9, 3);
        int result5 = enhancedCalc.add(1, 3);
        int result6 = enhancedCalc.sub(1, 3);
        System.out.println(result3 + " " + result4 + " " + result5 + " " + result6);

        ScientificCalculator scientificCalc = new ScientificCalculator();   // Multi-level inheritance
        int result7 = scientificCalc.add(1, 4);
        int result8 = scientificCalc.mul(13, 4);
        int result9 = scientificCalc.power(2, 10);
        System.out.println(result7 + " " + result8 + " " + result9);
    }
}