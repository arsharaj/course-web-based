/**
 * - out is a static object in System class.
 * - println() is a method of PrintStream class.
 * 
 * BufferedReader class can take input from multiple streams like Console, File, Network, etc.
 * BufferedReader must be closed explicitly.
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Inputs {
    public static void main(String args[]) throws IOException {
        System.out.print("Enter a number : ");
        int num1 = System.in.read(); // Gives the ASCII value of the first character
        System.out.println("num1 : " + (num1 - 48));

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);   // Requires an in object to pass to the BufferedReader
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("num2 : " + num2);
        br.close();

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println("num3 : " + num3);
    }
}