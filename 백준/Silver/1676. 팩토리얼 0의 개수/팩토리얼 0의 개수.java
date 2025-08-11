import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        /*
        모든 값들의 소인수 분해들은 2의 개수가 5의 개수보다 많다
        많다고 좋은 것이 아니라 2는 3개, 5는 2개라면
        5에 기준을 맞춰야 2^2,5^2으로 0의 개수가 2개가 된다
         */
        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);
    }
}