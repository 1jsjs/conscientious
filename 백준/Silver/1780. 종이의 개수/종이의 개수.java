import java.util.Scanner;

public class Main {
    static int[][] paper;
    static int[] counts = new int[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = scanner.nextInt();
            }
        }

        countPaper(0, 0, N);

        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);
    }

    static void countPaper(int x, int y, int size) {
        if (checkSame(x, y, size)) {
            counts[paper[x][y] + 1]++;
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                countPaper(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    static boolean checkSame(int x, int y, int size) {
        int value = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}