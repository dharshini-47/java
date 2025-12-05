import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        int lastEven = -1, lastOdd = -1;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
                lastEven = num;
            } else {
                oddCount++;
                lastOdd = num;
            }
        }

        if (evenCount == 1) {
            System.out.println(lastEven);
        } else if (oddCount == 1) {
            System.out.println(lastOdd);
        } else {
            System.out.println(-1);
        }
    }
}
