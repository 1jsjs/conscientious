/*
백준 2108번 : 통계학
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //수의 개수
        int [] arr = new int [N]; // 수를 저장할 배열
        int avg = 0; // 산술평균

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            avg += value;
        }
        Arrays.sort(arr); //오름차순으로 정렬하면 중앙값, 범위를 찾을 때 유용하다.

        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int skip = 0;
            int count = 1;
            int i_value = arr[i];

            for (int j = i + 1 ; j < N; j++) {
                if(i_value != arr[j]) {
                    break;
                }
                count++;
                skip++;
            }

            if (count > mode_max) {
                mode_max = count;
                mode = i_value;
                flag = true;
            } else if ( count == mode_max && flag == true) {
                mode = i_value;
                flag = false;
            }

            i += skip;
        }

        System.out.println((int)Math.round((double)avg / N)); // 산술평균
        System.out.println(arr[N / 2]);	// index 는 0 부터 시작하므로 주의, 중앙값
        System.out.println(mode); // 최빈값
        System.out.println(arr[N - 1] - arr[0]);// 범위


    }
}
