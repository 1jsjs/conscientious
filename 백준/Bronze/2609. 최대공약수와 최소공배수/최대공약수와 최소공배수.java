import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int maxNM = 1;

        //최대공약수 찾는 for문
        for (int i = 1; i <= Math.min(N,M); i++) {
          if (N % i == 0 && M % i == 0) {
              maxNM = i;
          }
        }

        //최소공배수 찾기
        int minNM = (N*M) / maxNM;

        System.out.println(maxNM);
        System.out.println(minNM);
    }
}