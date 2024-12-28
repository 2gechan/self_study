package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2164 {

    static int solution(int N) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        boolean flag = false;
        while (q.size() > 1) {
            int now = q.poll();
            if (flag) {
                q.offer(now);
            }
            flag = !flag;
        }

        return q.poll();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(solution(N));
    }
}
