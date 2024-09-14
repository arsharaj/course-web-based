/**
 * Use finally when we want to close a resource.
 * Try with resources can be used with classes that implements AutoClosable interface.
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String args[]) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            br.close();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(reader.readLine());
            System.out.println(num);
        }
    }
}