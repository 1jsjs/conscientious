import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(solve(scanner.next()));
            /*
            nextInt()를 쓸 때 뒤에 \n은 남아있으므로 빈 문자열 반환한다.
            그러므로 공백이나 개행 문자를 기준으로 토큰을 분리해서 읽는
            next()를 써야한다.
             */
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        /*
        for문이 끝나고도 스택에 남아있는 괄호가 있는지 보고
        YES나 NO 출력
         */
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}