import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        boolean found = false;
        StringBuilder sb = new StringBuilder();

        while (i < N && j < N) {
            if (A[i] == B[j]) {
                // To avoid duplicates in output
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ' ' || !sb.toString().endsWith(" " + A[i])) {
                    sb.append(A[i]).append(" ");
                    found = true;
                }
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        if (found) {
            System.out.println(sb.toString().trim());
        } else {
            System.out.println("-1");
        }
    }
}
