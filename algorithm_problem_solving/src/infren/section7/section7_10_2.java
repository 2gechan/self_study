package infren.section7;

import java.util.ArrayList;
import java.util.Scanner;

public class section7_10_2 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    static void dfs(int v) {
        if(v == n) answer++;
        else {
            for (int x : graph.get(v)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    dfs(x);
                    ch[x] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        ch = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph.get(s).add(e);
        }
        ch[1]= 1;
        dfs(1);
        System.out.println(answer);
    }
}
