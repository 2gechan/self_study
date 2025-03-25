package algorithm_practice.practice03.tue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Wonderland implements Comparable<Wonderland> {
    int s;
    int e;
    int cost;

    public Wonderland(int s, int e, int cost) {
        this.s = s;
        this.e = e;
        this.cost = cost;
    }

    @Override
    public int compareTo(Wonderland o) {
        return this.cost - o.cost;
    }
}
public class section9_03_07 {
    static int[] dp;

    static int find(int fa) {
        if (dp[fa] == fa) return fa;
        else return dp[fa] = find(dp[fa]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) dp[fa] = fb;
    }

    static int solution(List<Wonderland> list) {
        int answer = 0;
        Collections.sort(list);

        for (Wonderland w : list) {
            int fa = find(w.s);
            int fb = find(w.e);
            if (fa != fb) {
                answer += w.cost;
                union(w.s, w.e);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // 도시의 개수
        int E = sc.nextInt(); // 도로의 개수
        dp = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            dp[i] = i;
        }
        List<Wonderland> list = new ArrayList<>();
        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new Wonderland(s, e, cost));
        }
        System.out.println(solution(list));
    }
}
