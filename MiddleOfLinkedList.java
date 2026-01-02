import java.util.*;

class MiddleOfLinkedList {
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
        n.next = head;
        head = n;
    }

    static int middle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) insert(sc.nextInt());
        System.out.println(middle());
        sc.close();
    }
}
