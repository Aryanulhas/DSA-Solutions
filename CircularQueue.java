import java.util.*;

class CircularQueue {
    static int[] q;
    static int front = -1, rear = -1, size;

    static void init(int s) {
        size = s;
        q = new int[s];
    }

    static void enqueue(int x) {
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = x;
    }

    static int dequeue() {
        int x = q[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        init(n);
        for (int i = 0; i < n; i++) enqueue(sc.nextInt());
        for (int i = 0; i < n; i++) System.out.print(dequeue() + " ");
        sc.close();
    }
}
