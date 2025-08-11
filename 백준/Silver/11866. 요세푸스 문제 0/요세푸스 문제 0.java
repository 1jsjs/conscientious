import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        //큐에는 1 2 3 4 5 6 7이 들어있다.

        StringBuilder sb = new StringBuilder();
        //StringBuilder는 내부 문자열을 직접 변경할 수 있습니다. 반복되는 문져열 연산에 성능이 좋습니다.
        sb.append('<');
        // 출력이 <3, 6, 2, 7, 5, 1, 4> 이기 때문에.

        while (q.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int val = q.poll();
                q.offer(val);
            }

            sb.append(q.poll()).append(", ");
        }
        /*
        출력을 보면 <3, 6, 2, 7, 5, 1, 4> 이다.
        마지막 숫자는 공백이 없으므로 마지막 숫자 전까지만 반복문으로 출력하고
        마지막 숫자는 따로 출력한다.
         */
        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}