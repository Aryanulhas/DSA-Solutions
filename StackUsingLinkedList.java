import java.util.*;

class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node top = null;

    static void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    static int pop() {
        int x = top.data;
        top = top.next;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            push(sc.nextInt());
        }
        while (top != null) {
            System.out.print(pop() + " ");
        }
        sc.close();
    }
}
