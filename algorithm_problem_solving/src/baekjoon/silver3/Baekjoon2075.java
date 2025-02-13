package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pQ.offer(Integer.valueOf(st.nextToken()));
            }

        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = pQ.poll();
        }
        System.out.println(result);
    }
}
