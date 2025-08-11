/*
백준 10845번 : 큐
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] queue;
    public static int front = 0; // 큐의 맨 앞
    public static int rear = 0; // 큐의 맨 뒤

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        while (N > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
            N = N - 1;
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        queue[rear] = item;
        rear++;
    }

    public static int pop() {
        if(front == rear) {
            return -1;
        }
        else {
            int res = queue[front];
            front++;
            return res;
        }
    }

    public static int size() {
        return rear - front;
    }

    public static int empty() {
        if(front == rear) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int front() {
        if(front == rear) {
            return -1;
        }
        else {
            return queue[front];
        }
    }

    public static int back() {
        if(front == rear) {
            return -1;
        }
        else {
            return queue[rear - 1];
        }
    }
}
