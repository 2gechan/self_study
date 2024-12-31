package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon1158 {

    static String solution(Queue<Integer> queue, int K) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int cnt = 0;

        while (queue.size() > 1) {
            cnt++;
            int now = queue.poll();
            if (cnt == K) {
                sb.append(now + ", ");
                cnt = 0;
                continue;
            }
            queue.offer(now);
        }
        sb.append(queue.poll() + ">");

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.valueOf(line[0]);
        int K = Integer.valueOf(line[1]);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        System.out.println(solution(queue, K));
    }
}
