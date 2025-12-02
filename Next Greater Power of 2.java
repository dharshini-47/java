import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow=1;
        while(pow<=num){
            pow*=2;
        }
        System.out.println(pow);
    }
}