import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < N; i++) {
            int complement = X - arr[i];
            if (set.contains(complement)) {
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(found ? "yes" : "no");
    }
}
