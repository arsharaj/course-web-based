import java.util.Scanner;

class UF {
    private int[] arr;
    private int[] size;

    public UF(int n) {
        arr = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            size[i] = 1;
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int i) {
        while (i != arr[i]) {
            arr[i] = arr[arr[i]];
            i = arr[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if (pid == qid)
            return;
        if (size[pid] < size[qid]) {
            arr[qid] = pid;
            size[pid] += size[qid];
        } else {
            arr[pid] = qid;
            size[qid] += size[pid];
        }
    }
}

public class WeightedQuickUnionWithPathCompression {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        UF uf = new UF(n);
        while (n > 0) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (!uf.isConnected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
            n--;
        }
    }
}