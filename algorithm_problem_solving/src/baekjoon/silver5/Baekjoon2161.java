package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2161 {
    static String solution(Queue<Integer> q) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true; // true 일 때 버리고, false 일 때 옮긴다.
        while (q.size() > 1) {
            int num = q.poll();
            if (flag) {
                flag = false;
                sb.append(num + " ");
            }
            else {
                flag = true;
                q.offer(num);
            }
        }
        sb.append(q.poll() + "");

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        System.out.println(solution(q));
    }
}
