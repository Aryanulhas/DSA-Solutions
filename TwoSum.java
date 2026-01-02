import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int x : arr) {
            if (set.contains(target - x)) {
                found = true;
                break;
            }
            set.add(x);
        }
        System.out.println(found);
        sc.close();
    }
}
