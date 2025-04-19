package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1697 {

    static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] chk = new boolean[100001];
        queue.offer(n);
        chk[n] = true;
        int time = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int now = queue.poll();
                if (now == k) return time;
                if (now + 1 < 100001 && !chk[now + 1]) {
                    queue.offer(now + 1);
                    chk[now + 1] = true;
                }
                if (now - 1 >= 0 && !chk[now - 1]) {
                    queue.offer(now - 1);
                    chk[now - 1] = true;
                }
                if (now * 2 < 100001 && !chk[now * 2]) {
                    queue.offer(now * 2);
                    chk[now * 2] = true;
                }

            }

            time++;

        }
        return time;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        System.out.println(solution(n, k));
    }
}
