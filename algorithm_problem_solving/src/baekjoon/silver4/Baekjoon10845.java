package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            String command = line[0];

            if (command.equals("push")) {
                int num = Integer.valueOf(line[1]);
                queue.offer(num);
            }
            else if (command.equals("pop")) {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else {
                    int a = queue.poll();
                    sb.append(a + "\n");
                }
            }
            else if (command.equals("size")) {
                int size = queue.size();
                sb.append(size + "\n");
            }
            else if (command.equals("empty")) {
                if (queue.isEmpty()) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            }
            else if (command.equals("front")) {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else sb.append(queue.peek() + "\n");
            }
            else {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else {
                    int len = queue.size();
                    for (int j = 0; j < len; j++) {
                        int tmp = queue.poll();
                        queue.offer(tmp);
                        if (j + 1 == len) sb.append(tmp + "\n");
                    }
                }

            }

        }
        System.out.println(sb.toString());
    }
}
