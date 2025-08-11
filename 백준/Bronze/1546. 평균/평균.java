import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] score =  new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        int M = score[0];

        for (int i = 1; i < N; i++) {
            if (M < score[i]) {
                M = score[i];
            }
        }

        double newScoreSum = 0;

        for (int i = 0; i < N; i++) {
            newScoreSum += (double) score[i]/M*100;
        }

        System.out.println(newScoreSum / N);
    }
}