import java.util.Scanner;

public class Main {

    public static boolean [] prime; // 소수를 체크할 배열
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        prime = new boolean[N+1];
        get_prime();

        for (int i = M; i <= N; i++) {
            if(!prime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void get_prime () {
        //true = 소수 아님, false = 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i*i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}