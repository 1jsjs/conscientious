import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8];
        for (int i = 0; i < 8; i++) {
            num[i] = scanner.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            if (num[i] != i+1) {
                ascending = false;
            }
            if (num[i] != 8-i) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}