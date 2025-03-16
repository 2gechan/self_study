package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon16953 {

    static int solution(int a, int b) {

        Queue<Long> queue = new LinkedList<>();
        queue.offer(Long.valueOf(a));
        int cnt = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {

                long now = queue.poll();
                if (now == b) return cnt + 1;

                long tran1 = now * 2;
                if (tran1 <= b) {
                    queue.offer(tran1);
                }

                String tmp = now + "1";
                long tran2 = Long.valueOf(tmp);
                if (tran2 <= b) {
                    queue.offer(tran2);
                }

            }
            cnt++;
        }

        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        System.out.println(solution(a, b));
    }
}
