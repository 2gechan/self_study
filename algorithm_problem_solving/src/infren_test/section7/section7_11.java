package infren_test.section7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section7_11 {
    static int n, m, count = 0;
    static List<ArrayList<Integer>> graph;
    static int[] ch;
    static void dfs(int x) {
        if (x == n) count++;
        else {
            for (int node : graph.get(x)) {
                if (ch[node] == 0) {
                    ch[node] = 1;
                    dfs(node);
                    ch[node] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        dfs(1);
        System.out.println(count);
    }
}
