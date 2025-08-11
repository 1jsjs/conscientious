import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 4 != 0) {
            System.out.println("long ".repeat(N / 4 + 1)+"int");
        } else {
            System.out.println("long ".repeat(N / 4)+"int");
        }
    }
}