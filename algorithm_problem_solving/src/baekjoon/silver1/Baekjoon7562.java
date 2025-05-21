package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Baekjoon7562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {

            int I = Integer.parseInt(br.readLine());

            int[][] arr = new int[I][I];
            boolean[][] visit = new boolean[I][I];

            Queue<Point> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            queue.offer(new Point(x1, y1));

            st = new StringTokenizer(br.readLine());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if (x1 == x2 && y1 == y2) {
                sb.append(0).append("\n");
                continue;
            }


            int l = 0;
            boolean flag = false;
            while (!queue.isEmpty()) {

                int len = queue.size();

                for (int i = 0; i < len; i++) {

                    Point now = queue.poll();
                    for (int j = 0; j < dx.length; j++) {
                        int nx = now.x + dx[j];
                        int ny = now.y + dy[j];

                        if (nx >= 0 && nx < I && ny >= 0 && ny < I && !visit[nx][ny]) {
                            if (nx == x2 && ny == y2) flag = true;
                            else queue.offer(new Point(nx, ny));
                            visit[nx][ny] = true;
                        }
                    }

                }
                l++;
                if (flag) {
                    sb.append(l).append("\n");
                    break;
                }

            }

        }

        System.out.println(sb.toString());
    }
}
