package challenge2.week3;

import java.util.*;

public class w3_02 {
    static int n, m, result;

    static List<ArrayList<Integer>> list;
    static boolean[] visit;
    static void checkTree(int start) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        int node = 0;
        int edge = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            visit[cur] = true;
            node++; // 현재 노드 개수

            for (int x : list.get(cur)) {
                edge++;
                if (!visit[x]) q.offer(x);
            }
        }
        if ((edge / 2 ) + 1 == node) result++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int caseCnt = 1;
        while (true) {
            result = 0;
            n = sc.nextInt();
            m = sc.nextInt();
            if (n == 0 && m == 0) break;
            list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.get(a).add(b);
                list.get(b).add(a);
            }

            visit = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!visit[i]) checkTree(i);
            }

            sb.append("Case " + caseCnt + ": ");
            if (result == 0) sb.append("No trees.\n");
            else if (result == 1) sb.append("There is one tree.\n");
            else sb.append("A forest of " + result + " trees.\n");
            caseCnt++;
        }
        System.out.println(sb.toString());
    }
}
