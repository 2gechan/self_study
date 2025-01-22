package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.valueOf(NM[0]);
        int M = Integer.valueOf(NM[1]);

        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        int count = 0;
        String[] line = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            int target = Integer.valueOf(line[i]);
            int pos = q.indexOf(target); // 뽑아야할 수의 위치
            int leftMove = pos;
            int rightMove = q.size() - pos;

            if (leftMove < rightMove) {
                for (int j = 0; j < leftMove; j++) {
                    q.offerLast(q.pollFirst());
                    count++;
                }
            }
            else {
                for (int j = 0; j < rightMove; j++) {
                    q.offerFirst(q.pollLast());
                    count++;
                }
            }

            q.poll();

        }
        System.out.println(count);
    }
}
