/**
 * - Collections is a special class in util package that have various methods.
 * - It also has sort method to sort the elements as per natural ordering.
 * - To specify our own logic for sorting we have to use Comparator.
 * - Keep in mind that Collections class also works with Wrapper classes.
 * - if you don't want to pass Comparator to sort function then you must implement Comparable interface.
 * 
 * Note:
 * 1. Comparator - public int compare(T a, T b);
 * 2. Comparable - public int compareTo(T a);
 */

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age < that.age)
            return 1;
        return -1;
    }
}

public class Sorting {
    public static void main(String args[]) {
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10)
                    return 1;
                return -1;
            }
        };
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(31);
        nums1.add(72);
        nums1.add(29);
        System.out.println("Before " + nums1);
        Collections.sort(nums1, comparator1);
        System.out.println("After " + nums1);

        Comparator<String> comparator2 = new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() > b.length())
                    return 1;
                return -1;
            }
        };
        List<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Trifany");
        names.add("Tim");
        names.add("Wilson");
        Collections.sort(names, comparator2);
        System.out.println(names);

        Comparator<Student> comparator3 = (s1, s2) -> s1.age > s2.age ? 1 : -1;
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(21, "Rex"));
        students.add(new Student(12, "John"));
        students.add(new Student(18, "Michael"));
        students.add(new Student(20, "Trixy"));
        // Collections.sort(students, comparator3);
        Collections.sort(students, comparator3);
        for (Student student: students) {
            System.out.println(student);
        }
    }
}