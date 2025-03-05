package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Baekjoon11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(br.readLine());
            if (num == 0) {
                if (pQ.isEmpty()) sb.append(0).append("\n");
                else sb.append(pQ.poll()).append("\n");
            } else pQ.offer(num);
        }
        System.out.println(sb.toString());
    }
}
