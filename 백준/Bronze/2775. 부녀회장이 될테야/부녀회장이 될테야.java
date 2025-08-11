import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int [][] home = new int [15][15];

        for (int i = 1; i <= 14; i++) {
            home [0][i] = i; //0층의 i호에는 i명이 살고 있다는 걸 이용
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                home[i][j] = home[i][j-1] + home [i-1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(home[k][n]);
        }

    }
}