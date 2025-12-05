import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                char first = words[i].charAt(0);
                char last = words[i].charAt(words[i].length() - 1);
                String middle = words[i].substring(1, words[i].length() - 1);
                String reversedMiddle = new StringBuilder(middle).reverse().toString();
                words[i] = first + reversedMiddle + last;
            }
        }

        System.out.println(String.join(" ", words));
    }
}
