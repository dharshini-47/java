import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int N = sc.nextInt();
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                
                arr[i] = 0;
            }
        }
        sc.close();

        int remaining = N - K;
        if (remaining <= 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < remaining; i++) {
            if (i > 0) sb.append(' ');
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
