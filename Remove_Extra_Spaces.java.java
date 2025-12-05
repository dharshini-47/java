import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean space = false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
                sb.append(c);
                space = true;
            } else if(space){
                sb.append(' ');
                space = false;
            }
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == ' ') sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
