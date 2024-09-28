public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[] { -34, 12, 25, 1, -2, -23, 15 };
        System.out.println(find(a, -1));
    }

    private static int find(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < a[mid]) end = mid - 1;
            else if (key > a[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
