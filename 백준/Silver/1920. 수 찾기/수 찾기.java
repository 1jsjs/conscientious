import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] A = new int [N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);

        int M = scanner.nextInt();
        StringBuilder arrM = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, scanner.nextInt()) >= 0) {
                arrM.append(1).append('\n');
            } else {
                arrM.append(0).append('\n');
            }
        }
        System.out.println(arrM);
    }

    public static int binarySearch(int [] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;

        //lo가 hi보다 커지기 전까지 반복한다.
        while (lo <= hi) {
            int mid = (lo+hi) / 2;

            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}