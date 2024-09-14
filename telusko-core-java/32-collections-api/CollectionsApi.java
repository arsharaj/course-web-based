/**
 * Three similar terms:
 * 1. Collection API - Concept
 * 2. Collection - Interface
 * 3. Collections - Class
 * 
 * Notes:
 * - We can directly print collections.
 * - Collection works with objects not primitive values.
 * - Collection does not support indexing while List interface supports it.
 * - Map is not a part of Collection interface but comes under Collection Framework / Collection API.
 * - In a Map the keys are in set whereas values are in list.
 * - Vector is synchronized version of ArrayList.
 * - Hashtable is synchronized version of HashMap.
 * - ArrayDeque is faster than Stack and LinkedList
 * 
 * Collection API hierarchy:
 * - Iterable (Interface)
 *   - Collection (Interface)
 *     - List (Interface) : supports duplicate values and indexing
 *       - ArrayList (Class) - uses dynamic array with contiguous memory allocation
 *       - LinkedList (Class) - uses doubly linked list with non-contiguous memory allocation. Also implements Deque interface.
 *       - Vector (Class) - similar to arraylist but is synchronized
 *         - Stack (Class) - used to perform fifo operations
 *     - Queue (Interface)
 *       - PriorityQueue (Class) - The head is the least or max based on the ordering used.
 *       - Deque (Interface)
 *         - ArrayDeque - double ended queue that can be used as stack, queue and linked list
 *     - Set (Interface) : supports unique values and no indexing
 *       - HashSet (Class) : unsorted and unordered
 *       - LinkedHashSet (Class) : ordered
 *       - SortedSet (Interface)
 *          - TreeSet (Class) : sorted
 * - Map (Interface) : supports different indexes types using key-value pair
 *   - HashMap (Class) : unordered and unsorted keys
 *     - LinkedHashMap (Class) : ordered
 *   - Hashtable (Class) : unordered and unsorted keys but synchonized
 *   - SortedMap (Interface)
 *     - NavigableMap (Interface)
 *       - TreeMap (Class) : sorted
 */

import java.util.*;

public class CollectionsApi {
    public static void main(String args[]) {
        // List Interface
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);
        nums1.add(2);
        nums1.add(5);
        System.out.println(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            System.out.println(nums1.get(i));
        }
        for (int i : nums1) {
            System.out.println(i);
        }
        System.out.println(nums1.indexOf(2));

        // Set Interface
        Set<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(62);
        nums2.add(54);
        nums2.add(82);
        nums2.add(21);
        nums2.add(54);
        System.out.println(nums2);
        for (int i : nums2) {
            System.out.println(i);
        }

        // Iterator
        Iterator<Integer> it = nums1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Map Interface
        Map<String, Integer> students = new Hashtable<>();
        students.put("Nav", 56);
        students.put("Rex", 23);
        students.put("Sam", 67);
        students.put("Tim", 92);
        students.put("Rex", 45);
        System.out.println(students);
        System.out.println(students.get("Rex"));
        for (String name: students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}