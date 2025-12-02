import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float num = obj.nextFloat();
        System.out.println((int) Math.ceil(num));
    }
}