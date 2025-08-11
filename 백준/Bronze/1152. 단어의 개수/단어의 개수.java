import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int wordCount = 0;
        boolean existWord = false;

        for (int i = 0; i < word.length(); i++) {
            char location = word.charAt(i);

            if (location != ' ' && !existWord) {
                existWord = true;
                wordCount++;
            } else if (location == ' ') {
                existWord = false;
            }
        }

        System.out.println(wordCount);
    }
}