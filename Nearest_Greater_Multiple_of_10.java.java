import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int remainder=N%10;
        int result=N+(10-remainder);
        System.out.println(result);
    }
}