import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String s = sc.nextLine();
        int n = sentence.length();
        int m = s.length();
        if (m == 0 || n == 0 || m > n) {
            System.out.println("-1");
            return;
        }
        int count = 0;
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (sentence.charAt(i + j) != s.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }
}
