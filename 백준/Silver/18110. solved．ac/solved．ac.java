import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //몇 명의 의견이 반영 안 되는지 구하기
        int trimmedM = (int) Math.round(n*0.15);

        // 오름차순으로 정렬해서 가장 높은 난이도랑 가장 낮은 난이도 보기 쉽게 정렬
        Arrays.sort(arr);

        //절사평균 구하기
        int sum = 0;
        int people = 0; // 30% 절사평균을 구할 때 몇 명의 의견이 반영되는지 사람 수 구하기
        for (int i = trimmedM; i < n-trimmedM; i++) {
            sum += arr[i];
            people++;
        }

        double avg = people > 0 ? (double)sum / people : 0;
        System.out.println(Math.round(avg));
    }
}