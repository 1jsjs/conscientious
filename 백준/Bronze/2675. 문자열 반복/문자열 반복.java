import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testNum = scanner.nextInt();

        for (int i = 0; i<testNum; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    result.append(ch);
                }
            }

            System.out.println(result.toString());
        }
    }
}