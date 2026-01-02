import java.util.*;

class StackUsingArray {
    static int[] stack = new int[100];
    static int top = -1;

    static void push(int x) {
        stack[++top] = x;
    }

    static int pop() {
        return stack[top--];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            push(sc.nextInt());
        }
        while (top >= 0) {
            System.out.print(pop() + " ");
        }
        sc.close();
    }
}
