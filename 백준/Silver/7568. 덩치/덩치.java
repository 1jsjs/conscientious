import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [][] arr = new int [N][2];
        //몸무게와 키, 두 개만 필요하기 때문에

        for (int i = 0; i < N; i++) {
            arr [i][0] = scanner.nextInt();
            arr [i][1] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int rank = 1; // 등수는 1부터 시작
            for (int j = 0; j < N; j++) {
                if (i == j) { //자기자신 제외
                    continue;
                }
                //몸무게와 키 둘 다 크면 rank +1
                if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}