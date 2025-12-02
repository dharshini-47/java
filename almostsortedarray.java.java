import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int violationIndex = -1;
 
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                if (violationIndex != -1) {
                    System.out.println(-1);
                    return;
                }
                violationIndex = i;
            }
        }
 
        if (violationIndex == -1) {
            System.out.println(-1);
            return;
        }
        int i = violationIndex;

  
        boolean canChangeI = (i == 0 || arr[i - 1] < arr[i + 1]);


        boolean canChangeI1 = (i + 2 == N || arr[i] < arr[i + 2]);

        if (canChangeI)
            System.out.println(i);
        else if (canChangeI1)
            System.out.println(i + 1);
        else
            System.out.println(-1);
    }
}
