import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] sizesT = new int [6]; //S M L XL XXL XXXL

        for (int i = 0; i < 6; i++) {
            sizesT [i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int P = scanner.nextInt();

        int sumT = 0;
        for (int i = 0; i < 6; i++) {
            sumT += (sizesT[i] + T - 1) / T;
        }

        System.out.println(sumT);
        System.out.println(N / P + " " + N % P);
    }
}
