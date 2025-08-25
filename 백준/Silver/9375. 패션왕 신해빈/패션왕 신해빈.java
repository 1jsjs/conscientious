/*
백준 9375번 : 패션왕 신해빈
 */
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            HashMap<String, Integer> clothes = new HashMap<>(); //종류, 개수

            int N = scanner.nextInt();// 입력받는 옷의 개수

            while (N-- > 0) {
                scanner.next();
                String kind = scanner.next();

                if (clothes.containsKey(kind)) {
                    clothes.put(kind, clothes.get(kind) + 1);
                } else {
                    clothes.put(kind, 1);
                }
            }

            int result = 1;
            for (int val : clothes.values()) {
                result *= (val + 1);
            }
            System.out.println(result - 1);// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답이다.
        }


    }

}
