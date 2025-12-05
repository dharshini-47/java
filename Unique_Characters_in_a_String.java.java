import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int uniqueCount = 0;
        for (int count : map.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        if (uniqueCount == 0) {
            System.out.println(-1);
        } else {
            System.out.println(uniqueCount);
        }
    }
}
