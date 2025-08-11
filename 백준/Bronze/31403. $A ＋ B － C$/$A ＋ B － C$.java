import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        String strC = Integer.toString(C);

        String sumAB = strA+strB;

        int intSumAB = Integer.parseInt(sumAB);
        int intStrC = Integer.parseInt(strC);
        
        System.out.println(A+B-C);
        System.out.println(intSumAB-intStrC);
    }
}