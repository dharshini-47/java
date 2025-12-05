import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {   
                int quotient = N / i;
                if (quotient % 2 == 1) {  
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}
