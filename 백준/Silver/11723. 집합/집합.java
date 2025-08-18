/*
백준 11723번 : 집합
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        int S = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String [] input = br.readLine().split(" ");

            switch (input[0]) {
                case "all":
                    S = (1 << 21) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;
                default:
                    int x = Integer.parseInt(input[1]);
                    switch(input[0]) {
                        case "add":
                            S |= (1 << x);
                            break;
                        case "remove":
                            S &= ~(1 << x);
                            break;
                        case "check":
                            sb.append((S & (1 << x)) != 0 ? 1 : 0).append('\n');
                            break;
                        case "toggle":
                            S ^= (1 << x);
                            break;
                    }
            }
        }

        System.out.println(sb);

    }
}
