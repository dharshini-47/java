import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int changeIndex = findSingleUpdateIndex(arr);
            System.out.println(changeIndex);
        }
    }
    private static int findSingleUpdateIndex(int[] arr) {
        int n = arr.length;
        int count = 0;
        int index = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                count++;
                if (count > 1) return -1;
                if (i == 0 || arr[i - 1] < arr[i + 1]) {
                    index = i;
                } else {
                    index = i + 1;
                }
            }
        }

        return index;
    }
}
