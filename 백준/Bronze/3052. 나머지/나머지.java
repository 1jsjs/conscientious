import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numsCount = new int[10];

        for (int i = 0; i < 10; i++) {
            int nums = scanner.nextInt();
            int result = nums%42;
            numsCount[i] = result; // 정수 배열 numsCount에 나머지 저장
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            boolean isOAO = true;
            for (int j = 0; j < i; j++) {
                if (numsCount[i] == numsCount[j]) {
                    isOAO = false;
                    break;
                }
            }

            if (isOAO) {
                count++;

            }
        }

        System.out.println(count);


    }
}