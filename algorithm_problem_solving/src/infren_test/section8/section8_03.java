package infren_test.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Problem {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}
public class section8_03 {
    static int n, m, answer = 0;
    static void dfs(List<Problem> list, int maxTime, int maxScore, int c) {
        if (maxTime > m) return;
        if (n == c) {
            answer = Math.max(maxScore, answer);
        }
        else {
            Problem p = list.get(c);
            dfs(list, maxTime + p.time, maxScore + p.score, c + 1);
            dfs(list, maxTime, maxScore, c + 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            list.add(new Problem(s, t));
        }
        dfs(list, 0, 0, 0);
        System.out.println(answer);
    }
}
