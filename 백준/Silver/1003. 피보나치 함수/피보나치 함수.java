import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer [][] dp = new Integer [41][2];
    // N이 최대 40 까지 주어지고, 각 N에 0과 1이 호출된 횟수를 담아야 하므로

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1; // N=0 일 때의 0 호출 횟수
        dp[0][1] = 0; // N=0 일 때의 1 호출 횟수
        dp[1][0] = 0; // N=1 일 때의 0 호출 횟수
        dp[1][1] = 1; // N=1 일 때의 1 호출 횟수

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
        }
        System.out.println(sb);
    }

    static Integer [] fibonacci (int N) {
        if(dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        return dp[N];
    }
}
