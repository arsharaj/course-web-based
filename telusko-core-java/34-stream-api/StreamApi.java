/**
 * - Stream is an interface that has methods like filter, map, sorted, reduce.
 * - stream method was introduced in Java 1.8
 * - We can also use parallelStream method for multithreading.
 * - forEach method takes an object of a Consumer.
 * - Changes in the stream does not affect the original list.
 * Note:
 * - Keep in mind that streams cannot be reused.
 */

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamApi {
    public static void main(String args[]) {
        List<Integer> nums1 = Arrays.asList(4, 5, 7, 3, 2, 6);
        /*
        int sum = 0;
        for (int n : nums1) {
            if (n % 2 == 0) {
                n *= 2;
                sum += n;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            System.out.println(nums1.get(i));
        }
        for (int n : nums1) {
            System.out.println(n);
        }
        */
        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        nums1.forEach(consumer1);
        nums1.forEach(n -> System.out.println(n));
        Stream<Integer> stream1 = nums1.stream();
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        Stream<Integer> stream2 = stream1.filter(predicate1);
        Function<Integer, Integer> function1 = i -> i * 2;
        Stream<Integer> stream3 = stream2.map(function1);
        System.out.println(stream3.reduce(0, (c, e) -> c + e));
        System.out.println(nums1.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e));
        // stream3.forEach(n -> System.out.println(n));
        // stream1.forEach(n -> System.out.println(n));    // Throws IllegalStateException that stream cannot be used
        Stream<Integer> stream4 = nums1.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted();
        stream4.forEach(System.out::println);
        System.out.println();
        Stream<Integer> stream5 = nums1.parallelStream().filter(n -> n % 2 == 0).map(n -> n * 2);
        stream5.forEach(System.out::println);
    }
}