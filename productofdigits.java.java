import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();  
        long product = 1;

        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            product *= digit;
        }
        System.out.println(product);
    }
}
