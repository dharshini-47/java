import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String target = "kabali";
        char[] t = target.toCharArray();
        Arrays.sort(t);
        int count = 0;
        for(int i=0;i<N;i++){
            String s = sc.next();
            if(s.length() != target.length()) continue;
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if(Arrays.equals(c, t)) count++;
        }
        System.out.println(count);
    }
}
