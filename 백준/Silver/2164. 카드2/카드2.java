import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] num = new int [N*2]; // 무작정 크게 만들어놓았다

        for (int i = 1; i <= N; i++) {
            num[i] = i;
        }

        int front = 1;
        int rear = N;

        while (rear - front > 0) {
            front++; // front의 값이 무엇인지 알려줌
            num[++rear] = num[front++];
        }
        /*
        예) num[2] = 2 / num[6] = 6
        num[++rear] = num[front++]; 여기서
        1. ++rear으로 새로운 공간 num[7] 확보
        2. front++에서는 num[front]를 읽고 이걸 맨 위로 보내고
        3. front++를 새로운 front 값으로 저장
         */
        System.out.println(num[front]);
    }
}