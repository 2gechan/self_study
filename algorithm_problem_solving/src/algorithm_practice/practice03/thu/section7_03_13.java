package algorithm_practice.practice03.thu;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Point_07_13 {
    int x;
    int y;

    public Point_07_13(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class section7_03_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        result = new int[n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[s][e] = 1;
        }

        solution(arr);
        for (int i = 2; i <= n; i++) {
            System.out.println(result[i]);
        }
    }

    static int n;
    static int[] result;
    static boolean[] visit;
    static void solution(int[][] arr) {

        Queue<Point_07_13> queue = new LinkedList<>();
        queue.offer(new Point_07_13(0, 1));
        result[1] = 0;
        while (!queue.isEmpty()) {
            Point_07_13 now = queue.poll();
            int x = now.x;
            int y = now.y;

            for (int i = 1; i <= n; i++) {
                if (arr[y][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    result[i] = result[y] + 1;
                    queue.offer(new Point_07_13(y, i));
                }
            }
        }
    }
}
