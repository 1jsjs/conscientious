import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sumN = 1;
        int K = scanner.nextInt();
        int sumK = 1;
        int sumNK = 1;


        for (int i = N; i >= 1; i--) {
            sumN *= i;
        }

        for (int i = K; i >= 1; i--) {
            sumK *= i;
        }

        for (int i = N - K; i >= 1; i--) {
            sumNK *= i;
        }

        System.out.println(sumN / (sumK * sumNK));

    }
}