import java.util.*;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        boolean ok = true;
        for (int x : freq) {
            if (x != 0) {
                ok = false;
                break;
            }
        }

        System.out.println(ok);
        sc.close();
    }
}
