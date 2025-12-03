import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println("-1");
            return;
        }
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); 
        int smallest = arr[0];
        int secondSmallest = -1;
        for (int i = 1; i < N; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }
        System.out.println(secondSmallest);
    }
}
