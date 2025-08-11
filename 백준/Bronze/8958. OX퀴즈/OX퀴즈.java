import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String result = scanner.nextLine();

            int count = 0;
            int consecutive = 0;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    consecutive++;
                    count += consecutive;
                } else {
                    consecutive = 0;
                }

            }

            System.out.println(count);
        }
    }
}