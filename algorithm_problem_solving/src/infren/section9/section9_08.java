package infren.section9;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class WonderLandEdge2 implements Comparable<WonderLandEdge2>{
    public int vex;
    public int cost;

    public WonderLandEdge2(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(WonderLandEdge2 o) {
        return this.cost-o.cost;
    }
}

// 최소스패닝트리, 프림 알고리즘
public class section9_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<WonderLandEdge2>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<WonderLandEdge2>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new WonderLandEdge2(b, c));
            graph.get(b).add(new WonderLandEdge2(a, c));
        }
        int answer = 0;
        PriorityQueue<WonderLandEdge2> pQ = new PriorityQueue<>();
        pQ.offer(new WonderLandEdge2(1, 0));
        while (!pQ.isEmpty()) {
            WonderLandEdge2 tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (WonderLandEdge2 o : graph.get(ev)) {
                    if (ch[o.vex] == 0) pQ.offer(new WonderLandEdge2(o.vex, o.cost));
                }
            }
        }
        System.out.println(answer);

    }
}
