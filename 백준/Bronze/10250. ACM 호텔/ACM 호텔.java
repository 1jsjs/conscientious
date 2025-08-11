/*
교수님께 제출 안 한 것
백준 10250번: ACM 호텔

T 개의 테스트 개수
H(높이) / W(길이) / N(N 번째 도착한 손님)

예) H=6 W =12 N=10
N%H -> Y or YY
N/H+1 -> XX
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int floor = 0;
        int Num = 0;
        String roomNum = "";

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            floor = N%H; //층 수 (세로)
            Num = N/H + 1; // 방 호수 (가로)

            //N이 H의 배수라면 꼭대기 층, 방 호수는 N/H
            if (floor == 0) {
                floor = H;
                Num = N / H;
            }

            // 방 호수가 만약 한자리 수면 0+Num / 두자리 수면 Num
            if (Num < 10) {
                roomNum = floor + "0" + Num;
            } else {
                roomNum = floor + "" + Num;
            }

            System.out.println(roomNum);

        }
    }
}