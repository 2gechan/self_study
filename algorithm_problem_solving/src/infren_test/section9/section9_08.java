package infren_test.section9;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class section9_08 {
    static ArrayList<ArrayList<Edge>> arr = new ArrayList<ArrayList<Edge>>();
    static int[] dis;
    static int solution(int v) {
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            if (dis[tmp.node] == 0) {
                dis[tmp.node] = 1;
                answer += tmp.cost;
                for (Edge o : arr.get(tmp.node)) {
                    if (dis[o.node] == 0) pQ.offer(o);
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        dis = new int[v + 1];
        for (int i = 0; i <= v; i++) arr.add(new ArrayList<>());
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.get(a).add(new Edge(b, c));
            arr.get(b).add(new Edge(a, c));
        }
        System.out.println(solution(1));
    }
}
