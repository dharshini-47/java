import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String word=sc.next();
       int n=word.length();
       if(n%2==1){
           int mid=n/2;
           word=word.substring(0,mid)+ "*" +word.substring(mid+1);
       }
       else{
           int mid1=n/2-1;
           int mid2=n/2;
           word=word.substring(0,mid1)+ "**" +word.substring(mid2+1);
       }
       System.out.println(word);
    }
}