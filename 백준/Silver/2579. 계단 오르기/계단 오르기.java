/*
백준 2579번 : 계단 오르기

계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
마지막 도착 계단은 반드시 밟아야 한다.

총 점수의 최댓값을 구해라
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //계단의 개수

        int [] arr = new int[n+1]; // i번째 계단의 점수
        int [] dp = new int[n+1]; //i번째 계단까지 도달할 때 얻을 수 있는 최대 점수

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        //초깃값 설정
        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        //dp[i-2] : 1칸 건너서 오기 / dp[i-3] + arr[i-1]: 두 계단 연속 밟기
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i - 1]) + arr[i];
        }
        System.out.println(dp[n]);


    }
}