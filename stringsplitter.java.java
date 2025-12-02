import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder odd = new StringBuilder();   // characters at odd positions (1,3,5…)
        StringBuilder even = new StringBuilder();  // characters at even positions (2,4,6…)

        for (int i = 0; i < S.length(); i++) {
            if ((i + 1) % 2 == 1) {  // odd position (1-based index)
                odd.append(S.charAt(i));
            } else {
                even.append(S.charAt(i));
            }
        }

        System.out.println(odd.toString() + " " + even.toString());
    }
}
