import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) { System.out.println("-1"); return; }
        int N = sc.nextInt();
        if (!sc.hasNextInt()) { System.out.println("-1"); return; }
        int K = sc.nextInt();
        if (N <= 0 || K <= 0) {
            System.out.println("-1");
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            if (sc.hasNextInt()) arr[i] = sc.nextInt();
            else arr[i] = 0; 
        }
        Arrays.sort(arr);
        int distinctCount = 0;
        Integer last = null;
        for (int i = 0; i < N; i++) {
            if (last == null || arr[i] != last) {
                distinctCount++;
                last = arr[i];
                if (distinctCount == K) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
