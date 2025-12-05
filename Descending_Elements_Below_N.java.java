import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < N) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            System.out.print("-1");
        } else {
            result.sort(Collections.reverseOrder());

            for (int i = 0; i < result.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
        }
    }
}
