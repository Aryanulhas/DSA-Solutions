import java.util.*;

class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxSoFar = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            curr = Math.max(x, curr + x);
            maxSoFar = Math.max(maxSoFar, curr);
        }
        System.out.println(maxSoFar);
        sc.close();
    }
}
