import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prev = 0;
        boolean valid = true;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if (!romanMap.containsKey(c)) {
                valid = false;
                break;
            }
            int value = romanMap.get(c);
            if (value < prev) {
                result -= value;
            } else {
                result += value;
            }
            prev = value;
        }

        if (valid) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
