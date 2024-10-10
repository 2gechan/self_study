package algorithm_practice.thu.practice02;

import java.util.*;

class Edge implements Comparable<Edge> {
    int e;
    int cost;

    public Edge(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
public class section9_05_02 {
    static int[] chk;
    static List<ArrayList<Edge>> list;
    static void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        chk[v] = 0;
        pQ.offer(new Edge(v, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.e;
            int nowCost = tmp.cost;
            if (nowCost > chk[now]) continue;
            for (Edge e : list.get(now)) {
                if (chk[e.e] > nowCost + e.cost) {
                    chk[e.e] = nowCost + e.cost;
                    pQ.offer(new Edge(e.e, chk[e.e]));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new ArrayList<>();
        chk = new int[n + 1];
        Arrays.fill(chk, Integer.MAX_VALUE);
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int cost = sc.nextInt();
            list.get(s).add(new Edge(e, cost));
        }
        solution(1);
        for (int i = 2; i <= n; i++) {
            if (chk[i] == Integer.MAX_VALUE) System.out.println(i + " : impossible");
            else System.out.println(i + " : " + chk[i]);
        }
    }
}
