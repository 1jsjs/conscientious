import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int total = 0;
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = i; j < N - 1; j++) {
                if(arr[j + 1] == arr[j] + 1) {
                    count++;
                }else {
                    break;
                }
            }
            total += arr[i];
            i = i + count;
        }
        System.out.println(total);
    }
}