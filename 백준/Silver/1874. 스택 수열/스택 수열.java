import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = scanner.nextInt();
        int startN = 0;

        while (n > 0) {

            int lastN = scanner.nextInt();

            if (lastN > startN) {
                //startN + 1부터 입력받은 lastN까지 push함
                for (int i = startN + 1; i <= lastN; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }

                //다음 push를 할 때, 오름차순 유지하기 위해 변수 초기화
                startN = lastN;
            } else if (stack.peek() != lastN) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

            n--;
        }
        System.out.println(sb);
    }
}