package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int x = Integer.valueOf(br.readLine());
            if (x == 0) {
                if (pQ.isEmpty()) sb.append(0).append("\n");
                else sb.append(pQ.poll()).append("\n");
            } else pQ.offer(x);
        }

        System.out.println(sb.toString());
    }
}
