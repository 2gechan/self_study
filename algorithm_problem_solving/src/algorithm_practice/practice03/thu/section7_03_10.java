package algorithm_practice.practice03.thu;

import java.util.Scanner;

public class section7_03_10 {
    static boolean[] visit;
    static int n, m, answer = 0;
    static int[][] graph;

    static void solution(int l) {
        if (l == n) {
            answer++;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[l][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    solution(i);
                    visit[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visit = new boolean[n + 1];
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s][e] = 1;
        }
        visit[1] = true;
        solution(1);
        System.out.println(answer);
    }
}
