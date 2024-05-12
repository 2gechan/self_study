package infren_test.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class section8_14 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static List<Point> hs, pz;

    static void dfs(int l, int s) {
        if (l == m) {
            int sum = 0;
            for (Point h : hs) {
                int min = Integer.MAX_VALUE;
                for (int i : combi) {
                    min = Math.min(min, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += min;
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
        pz = new ArrayList<>();
        hs = new ArrayList<>();
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
