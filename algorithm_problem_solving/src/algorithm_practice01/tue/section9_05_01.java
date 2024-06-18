package algorithm_practice01.tue;

import java.util.*;

/*
다익스트라 알고리즘
가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로 그램을 작성하세요.
(경로가 없으면 Impossible를 출력한다)
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다
그 다음부터 M줄에 걸쳐 연 결정보와 거리비용이 주어진다.
1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
 */
class Edge implements Comparable<Edge> {
    int node;
    int cost;

    public Edge(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
public class section9_05_01 {
    static int[] chk;
    static ArrayList<ArrayList<Edge>> list;
    static void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        chk[v] = 0;
        pQ.offer(new Edge(v, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.node;
            int nowCost = tmp.cost;
            if (nowCost > chk[now]) continue;
            for (Edge ob : list.get(now)) {
                if (chk[ob.node] > nowCost + ob.cost) {
                    chk[ob.node] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.node, chk[ob.node]));
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        chk = new int[n + 1];
        Arrays.fill(chk, Integer.MAX_VALUE);
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            list.get(s).add(new Edge(e, c));
        }
        solution(1);
        for (int i = 2; i <= n; i++) {
            if (chk[i] == Integer.MAX_VALUE) System.out.println(i + " : impossible");
            else System.out.println(i + " : " + chk[i]);
        }
    }
}
