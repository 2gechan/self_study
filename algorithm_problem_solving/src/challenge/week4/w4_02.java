package challenge.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class w4_02 {
    static int[][] arr;
    static boolean[] visit;
    static int n, m, v;

    static void dfs(int v) {

        visit[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i <= n; i++) {
            if (arr[v][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visit = new boolean[n + 1];
        q.offer(v);
        visit[v] = true;
        while (!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current + " ");
            for (int i = 1; i <= n; i++) {
                if (arr[current][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    q.offer(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        bfs(v);
    }
}
