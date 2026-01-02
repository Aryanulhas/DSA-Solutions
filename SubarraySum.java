import java.util.*;

class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int sum = 0, start = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > target && start <= i) sum -= arr[start++];
            if (sum == target) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        sc.close();
    }
}
