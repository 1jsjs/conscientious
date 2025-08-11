import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // *이라는 변수가 있으니 정수로 받을 수가 없다.
        int sum = 0;
        int missingI = -1; //*표시된 곳은 -1로 처리

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '*') {
                missingI = i;
                continue; //*는 sum에 더하지 않는다.
            }

            int digit = Character.getNumericValue(ch);
            //Character.getNumericValue()는 문자를 정수 숫자로 변환할 때 사용하는 함수

            int weight = (i % 2 ==0) ? 1 : 3; //가중치 구하기
            sum = sum + digit*weight;
        }

        int missingW = (missingI % 2 == 0) ? 1 : 3;

        int remainder = sum % 10; // 나머지 찾을 수 있음
        int missingD;

        if (missingW == 1) {
            missingD = (10 - remainder) % 10;
        } else {
            // 3의 mod 10에서의 곱셈 역원은 7
            missingD = ((10 - remainder + 10) * 7) % 10;
        }

        System.out.println(missingD);
    }
}