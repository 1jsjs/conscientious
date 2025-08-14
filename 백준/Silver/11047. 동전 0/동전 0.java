/*
백준 11047번 : 동전 0
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int [] arr = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        //동전 개수 최솟값을 구해야 하므로
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                count = count + (K/ arr[i]);
                K = K % arr[i];
            }
        }

        System.out.println(count);
    }
}