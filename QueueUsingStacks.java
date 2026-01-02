import java.util.*;

class QueueUsingStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x) {
        s1.push(x);
    }

    static int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) enqueue(sc.nextInt());
        for (int i = 0; i < n; i++) System.out.print(dequeue() + " ");
        sc.close();
    }
}
