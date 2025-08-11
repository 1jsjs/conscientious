/*
indexOf()는 파이썬의 find()와 동일하게
문자가 처음 등장하는 인덱스를 반환하고
없으면 -1을 반환합니다.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S =sc.nextLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(S.indexOf(c) + " ");
        }
    }
}
