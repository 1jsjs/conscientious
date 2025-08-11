import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();

        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int number = scanner.nextInt();

            if (number == 0) {    // 0이라면 스택에 저장된 top 원소를 지운다.
                stack.pop();
            } else {
                stack.push(number);
            }
        }
        int sum = 0;

        for (int o : stack) {
            sum += o;
        }

        System.out.println(sum);
    }
}
