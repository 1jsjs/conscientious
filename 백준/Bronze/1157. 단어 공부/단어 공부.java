import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        int [] wordCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i)-'A';
            wordCount[num]++;

        }

        int max = 0;
        char answer = '?';

        for (int i = 0; i< wordCount.length; i++) {
            if (max < wordCount[i]) {
                max = wordCount[i];
                answer = (char)(i+'A');
            } else if (max == wordCount[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);

    }
}