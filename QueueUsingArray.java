import java.util.*;

class QueueUsingArray {
    static int[] q = new int[100];
    static int front = 0, rear = 0;

    static void enqueue(int x) {
        q[rear++] = x;
    }

    static int dequeue() {
        return q[front++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) enqueue(sc.nextInt());
        while (front < rear) System.out.print(dequeue() + " ");
        sc.close();
    }
}
