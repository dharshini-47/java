import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long sum = 0;
        for(int i=0;i<s.length();i++){
            int d = s.charAt(i) - '0';
            sum += (long)d * d;
        }
        System.out.println(sum);
    }
}
