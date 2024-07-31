package algorithm_practice01.thu.pracetice01;

import java.util.*;

/*
그래프 최단거리(BFS)
번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 */
public class section7_13_01 {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] ch, dis;
    static int cnt = 0;
    static void solution(int l) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(l);
        ch[1] = 1;
        dis[1] = 0;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            for (int x : list.get(tmp)) {
                if (ch[x] == 0) {
                    q.offer(x);
                    ch[x] = 1;
                    dis[x] = dis[tmp] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        solution(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
