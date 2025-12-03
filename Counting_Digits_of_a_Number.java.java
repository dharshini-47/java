import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        int num = N;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.print(count);
    }
}
