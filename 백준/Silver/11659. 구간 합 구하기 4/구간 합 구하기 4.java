import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //수의 개수
        int M = scanner.nextInt(); //합을 구해야 하는 횟수

        int [] arr = new int[N+1]; //N개의 수를 저장할 배열
        arr[0] = 0;
        for (int i = 0; i < N; i++) {
            arr[i+1] = arr[i] + scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(arr[b] - arr[a-1]);
        }
    }
}