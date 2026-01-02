import java.util.*;

class InsertAtEnd {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head = null;

    static void insert(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) insert(sc.nextInt());
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        sc.close();
    }
}
