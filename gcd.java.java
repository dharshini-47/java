import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
                if (N <= 0 || M <= 0) {
            System.out.println(-1);
            return;
                }

        while (M != 0) {
            long temp = M;
            M = N % M;
            N = temp;
        }
        System.out.println(N);
    }
}

