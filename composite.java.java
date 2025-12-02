import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (isComposite(num)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    static boolean isComposite(int num){
        if(num<=1) return true;
        if(num==2) return false;
        if(num % 2==0) return true;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return true;
            }
        }
        return false;
    }
}