import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int position = 0; //피즈버즈말고 숫자가 문자열 탈을 쓴 게 몇번째에 있는지
        int num = 0; // 그 숫자를 정수로 저장하기 위한 변수
        String[] words = new String[3]; // 일단 문자열로 입력 받는다고 했으니

        for (int i = 0; i < 3; i++) {
            words[i] = sc.nextLine();
            if (!words[i].equals("FizzBuzz") && !words[i].equals("Fizz") && !words[i].equals("Buzz")) {
                num = Integer.parseInt(words[i]);
                position = i + 1; //i가 0, 1, 2 이므로 position은 1, 2, 3이다. 4번째 숫자를 구하는 것이여서 이렇게 했다.
            }
        }

        int nextNum = num + (4 - position);
        // 구해야 할 숫자 nextNum은 position이 1이면 +3을 해야 4번째 숫자가 되므로 4-position으로 해놨다.

        if (nextNum % 3 == 0 && nextNum % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0 && nextNum % 5 != 0) {
            System.out.println("Fizz");
        } else if (nextNum % 3 != 0 && nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else if (nextNum % 3 != 0 && nextNum % 5 != 0) {
            System.out.println(nextNum);
        }
    }
}