import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            boolean found = false;


            for (int j = 0; j < s2.length(); j++) {
                if (c1 == s2.charAt(j)) {
                    found = true;  
                    break;
                }
            }
            if (!found) {
                result += c1;
            }
        }
        if (result.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
    }
}
