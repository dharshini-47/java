import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++) pq.add(sc.nextInt());
        for(int i=0;i<K;i++){
            pq.add(sc.nextInt());
            System.out.print(pq.peek());
            if(i < K-1) System.out.print(" ");
        }
    }
}
