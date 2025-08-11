/*
백준 1181번 : 단어 정렬

단어 사전순 정렬은 compareTo() 메소드를 쓰면 된다.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String [] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr [i] = scanner.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}