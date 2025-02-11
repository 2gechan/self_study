package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Balloon {
    int move;
    int index;

    public Balloon(int move, int index) {
        this.move = move;
        this.index = index;
    }
}
public class Baekjoon2346 {

    static String solution(List<Balloon> list) {
        Deque<Balloon> dq = new ArrayDeque<>();

        for (Balloon b : list) {
            dq.offer(b);
        }

        StringBuilder sb = new StringBuilder();
        int move = dq.poll().move;
        sb.append("1 ");
        while (!dq.isEmpty()) {

            // 왼쪽으로 이동
            if (move < 0) {
                for (int i = 1; i < -move; i++) {
                    dq.offerFirst(dq.pollLast());
                }
                Balloon now = dq.pollLast();
                move = now.move;
                sb.append(now.index + " ");
            }
            // 오른쪽으로 이동
            else {
                for (int i = 1; i < move; i++) {
                    dq.add(dq.poll());
                }
                Balloon now = dq.poll();
                move = now.move;
                sb.append(now.index + " ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        String[] line = br.readLine().split(" ");
        List<Balloon> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(new Balloon(Integer.valueOf(line[i - 1]), i));
        }
        System.out.println(solution(list));
    }
}
