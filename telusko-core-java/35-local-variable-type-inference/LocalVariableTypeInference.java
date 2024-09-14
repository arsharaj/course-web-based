public class LocalVariableTypeInference {
    public static void main(String args[]) {
        var a = 1;  // var keyword is applicable to only local variables
        System.out.println(a);
        int b;
        // var c;  // Cannot use var on variable without initializer

        String var = "";    // var can be used as a variable name as well as keyword
        // var nums[] = new int[5]; // var is not allowed as an element type of an array
        var nums = new int[5];
    }
}