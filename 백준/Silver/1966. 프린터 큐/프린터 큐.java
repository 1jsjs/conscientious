import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scanner.nextInt();

        while (T-- > 0) {

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            LinkedList<int[]> q = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                // {초기 위치, 중요도}
                q.offer(new int[] { i, scanner.nextInt() });
            }

            int count = 0;

            while (!q.isEmpty()) {

                int[] front = q.poll(); //가장 첫 원소
                boolean isMax = true;
                //front에 있는 원소가 가장 큰 원소인지 확인해주는 변수

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(isMax == false) {
                    continue;
                }

                count++;
                if(front[0] == M) {
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

}