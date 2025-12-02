import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
