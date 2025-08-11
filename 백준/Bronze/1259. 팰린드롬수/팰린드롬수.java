import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String num = scanner.nextLine();

            if (num.equals("0")) {
                break;
            }

            StringBuilder num1 = new StringBuilder(num);
            String reversedNum = num1.reverse().toString();

            if ( num.equals(reversedNum)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}