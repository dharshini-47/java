import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {    
            int kabali = sc.nextInt();
            int opponent = sc.nextInt();
            
            int diff = Math.abs(kabali - opponent);
            System.out.println(diff);
        }
    }
}
