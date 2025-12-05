import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int val = (y2 - y1)*(x3 - x1) - (y3 - y1)*(x2 - x1);
        if(val == 0) System.out.println("yes");
        else System.out.println("no");
    }
}
