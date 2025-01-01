package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");

            String command = line[0];

            int num = 0;
            switch (command) {
                case "push_front": deque.addFirst(Integer.valueOf(line[1])); break;
                case "push_back": deque.addLast(Integer.valueOf(line[1])); break;
                case "pop_front":
                    num = -1;
                    if (!deque.isEmpty()) {
                        num = deque.pollFirst();
                    }
                    sb.append(num + "\n");
                    break;
                case "pop_back":
                    num = -1;
                    if (!deque.isEmpty()) {
                        num = deque.pollLast();
                    }
                    sb.append(num + "\n");
                    break;
                case "size": sb.append(deque.size() + "\n"); break;
                case "empty":
                    if (deque.isEmpty()) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "front":
                    num = -1;
                    if (!deque.isEmpty()) num = deque.peekFirst();
                    sb.append(num + "\n");
                    break;
                case "back":
                    num = -1;
                    if (!deque.isEmpty()) num = deque.peekLast();
                    sb.append(num + "\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
