/*
백준 10816번 : 숫자 카드 2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받는 수의 범위 : -10,000,000 ~ 10,000,000
        int[] count = new int[20000001];

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer((br.readLine()), " ");
        //한 줄에 다수의 입력이 있는 경우에는 `StringTokenizer` 또는 `split()`을 사용

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        //상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            sb.append(count[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');
        }
        System.out.println(sb);
    }
}