import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("-1");
            return;
        }
        int N = sc.nextInt();
        if (N <= 1) {
            System.out.println("-1");
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("-1");
                return;
            }
            arr[i] = sc.nextInt();
        }
        int firstZero = -1;
        int secondZero = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                firstZero = i;
                break;
            }
        }
        if (firstZero == -1) {
            System.out.println("-1");
            return;
        }
        for (int i = firstZero + 1; i < N; i++) {
            if (arr[i] == 0) {
                secondZero = i;
                break;
            }
        }
        if (secondZero == -1) {
            System.out.println("-1");
            return;
        }
        if (secondZero == firstZero + 1) {
            System.out.println("-1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = firstZero + 1; i < secondZero; i++) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
