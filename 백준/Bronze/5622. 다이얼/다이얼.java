import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int tempTime = 0;
        int takeTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char alpha = word.charAt(i);

            if (alpha == 'W' || alpha == 'X' || alpha == 'Y' || alpha == 'Z') {
                tempTime = 10;
                takeTime += tempTime;
            } else if (alpha == 'T' || alpha == 'U' || alpha == 'V') {
                tempTime = 9;
                takeTime += tempTime;
            } else if (alpha == 'P' || alpha == 'Q' || alpha == 'R' || alpha == 'S') {
                tempTime = 8;
                takeTime += tempTime;
            } else if (alpha == 'M' || alpha == 'N' || alpha == 'O') {
                tempTime = 7;
                takeTime += tempTime;
            } else if (alpha == 'J' || alpha == 'K' || alpha == 'L') {
                tempTime = 6;
                takeTime += tempTime;
            } else if (alpha == 'G' || alpha == 'H' || alpha == 'I') {
                tempTime = 5;
                takeTime += tempTime;
            } else if (alpha == 'D' || alpha == 'E' || alpha == 'F') {
                tempTime = 4;
                takeTime += tempTime;
            } else if (alpha == 'A' || alpha == 'B' || alpha == 'C') {
                tempTime = 3;
                takeTime += tempTime;
            }

        }

        System.out.println(takeTime);

    }
}