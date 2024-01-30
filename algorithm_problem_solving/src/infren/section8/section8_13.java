package infren.section8;

import java.util.ArrayList;
import java.util.Scanner;

// dfs 알고리즘을 이용한 nCm 조합을 구하여 가장 효율적인 경우의수 찾기
public class section8_13 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs, pz;
    static void dfs(int l, int s) {
        if (l == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for (int i = s; i < len; i++) {
                combi[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>(); // 피자집들의 좌표 정보
        hs = new ArrayList<>(); // 가정집들의 좌표 정보
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if(tmp == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        dfs(0, 0);
        System.out.println(answer);
    }
}
