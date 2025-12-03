import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int M = obj.nextInt();
        int N = obj.nextInt();
        int diff=M-N;
        if(diff%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}