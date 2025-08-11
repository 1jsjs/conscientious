import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int multiABC = A * B * C;
        int [] count = new int [10];

        while (multiABC > 0) {
            count[multiABC%10]++;
            multiABC /= 10;
        }

        for (int i = 0; i<10; i++) {
            System.out.println(count[i]);
        }
    }
}