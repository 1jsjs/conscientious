import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N  = scanner.nextInt();
        int result = 0;

        int len = String.valueOf(N).length();

        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            if (sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}