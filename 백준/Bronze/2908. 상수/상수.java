import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String strA = Integer.toString(A);
        String strB = Integer.toString(B);

        String reverseA = "";
        for (int i = strA.length()-1; i >= 0; i--) {
            reverseA += strA.charAt(i);
        }
        String reverseB = "";
        for (int i = strB.length()-1; i >= 0; i--) {
            reverseB += strB.charAt(i);
        }

        int result = 0;
        int finalA = Integer.parseInt(reverseA);
        int finalB = Integer.parseInt(reverseB);

        if (finalA>finalB) {
            System.out.println(finalA);
        }
        else {
            System.out.println(finalB);
        }

        scanner.close();
    }
}