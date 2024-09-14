class Operators {
    public static void main(String args[]) {
        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        result = num1 - num2;
        result = num1 * num2;
        result = num1 / num2;
        result = num1 % num2;
        System.out.println(result);

        int num = 3;
        num = num + 2;
        num *= 2;
        num++;
        num--;
        System.out.println(num);

        int i = ++num;
        i = num++;
        System.out.println(i);

        int a = 6;
        int b = 6;
        boolean c = a < b;
        c = a >= b;
        c = a != b;
        double x = 8.80030000001;
        double y = 8.80030000001;
        boolean d = x == y;
        System.out.println(d);

        int first = 7;
        int second = 5;
        int third = 5;
        int fourth = 9;
        boolean status = first > second && third > fourth;
        status = first > second || third > fourth;
        System.out.println(!status);
    }
}