package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Silver11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        int cnt = 0;
        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                sb.append(deque.poll()).append(">");
                break;
            }
            cnt++;
            if (cnt == k) {
                sb.append(deque.poll()).append(", ");
                cnt = 0;
            }
            else {
                int num = deque.poll();
                deque.offer(num);
            }

        }
        System.out.println(sb.toString());

    }
}
