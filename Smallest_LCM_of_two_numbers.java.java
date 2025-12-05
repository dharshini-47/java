import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long a = L, b = R;
        while(b != 0){
            long t = b;
            b = a % b;
            a = t;
        }
        long gcd = a;
        long lcm = (L / gcd) * R;
        System.out.println(lcm);
    }
}
