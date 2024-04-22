package infren_test.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section7_08 {
    static int[] sample = {1, -1, 5};
    static int[] ch;
    static int bfs(int s, int e) {
        Queue<Integer> q = new LinkedList<>();
        ch = new int[10001];
        int l = 0;
        q.offer(s);
        ch[s] = 1;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + sample[j];
                    if (nx == e) return l + 1;
                    if (x >= 1 && x <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            l++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }
}
