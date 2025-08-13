/*
백준 1764번 : 듣보잡
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //듣도 못한 사람의 수
        int M = scanner.nextInt(); //보도 못한 사람의 수
        scanner.nextLine();

        Set<String> NN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            NN.add(scanner.nextLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = scanner.nextLine();
            if (NN.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result); //사전 순 정렬

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
