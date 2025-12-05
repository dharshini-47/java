import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        while(K != 0){
            int t = K;
            K = N % K;
            N = t;
        }
        System.out.println(N);
    }
}
