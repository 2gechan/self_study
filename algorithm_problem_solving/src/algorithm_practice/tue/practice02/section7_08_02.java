package algorithm_practice.tue.practice02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section7_08_02 {
    static int[] move = {1, -1, 5};
    static boolean[] visit = new boolean[100001];
    static int solution(int S, int E) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int now = q.poll();
                if (now == E) return answer;
                for (int j = 0; j < 3; j++) {
                    int next = now + move[j];
                    if (next >= 1 && next <= 10000 && !visit[next]) {
                        q.offer(next);
                        visit[next] = true;
                    }
                }

            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.println(solution(S, E));
    }
}
