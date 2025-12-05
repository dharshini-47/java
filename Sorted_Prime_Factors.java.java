import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i*i<=N;i++){
            if(N % i == 0){
                list.add(i);
                while(N % i == 0) N /= i;
            }
        }
        if(N > 1) list.add(N);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i < list.size()-1) System.out.print(" ");
        }
    }
}
