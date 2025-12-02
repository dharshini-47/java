import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int L = obj.nextInt();
        int R = obj.nextInt();
        if (N>L && N<R){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
     }
    }
   