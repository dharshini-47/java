import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.matches("\\d+")) System.out.println("yes");
        else System.out.println("no");
    }
}
