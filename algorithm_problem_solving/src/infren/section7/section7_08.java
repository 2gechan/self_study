package infren.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// bfs를 이용한 최소한의 이동으로 위치 찾기
public class section7_08 {
    static int[] dis = {1, -1, 5};
    static int[] ch;

    static int bfs(int s, int e) {
        Queue<Integer> q = new LinkedList<>();
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                if (x == e) return l;
                for (int j = 0; j < 3; j++) {
                    int a = x + dis[j];
                    if (a >= 1 && a <= 10000 && ch[a] == 0) {
                        ch[a] = 1;
                        q.offer(a);
                    }
                }
            }
            l++;
        }
        return l;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }
}
