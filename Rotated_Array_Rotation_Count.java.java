import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int[] arr = new int[M];
    
    for (int i = 0; i < M; i++) {
        arr[i] = sc.nextInt();
    }
    
    int rotation = -1;
    for (int i = 0; i < M - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            rotation = i + 1;
            break;
        }
    }
   
    if (rotation == -1 && arr[0] < arr[M-1]) {
        rotation = -1;
    }
    else if (rotation == -1 && arr[0] > arr[M-1]) {
        rotation = 0;
    }
    
    System.out.println(rotation);
}
}
