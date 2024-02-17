package infren.section9;

import java.util.*;

class WonderLandEdge implements Comparable<WonderLandEdge>{
    int sNode;
    int eNode;
    int cost;

    public WonderLandEdge(int sNode, int eNode, int cost) {
        this.sNode = sNode;
        this.eNode = eNode;
        this.cost = cost;
    }
    @Override
    public int compareTo(WonderLandEdge o) {
        return this.cost - o.cost;
    }
}

// 최소 스패닝 트리, Union & Find 활용
// 크루스칼 알고리즘
public class section9_07 {
    static int[] unf;
    static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }
    // 2 - 9 - 3 - 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        List<WonderLandEdge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new WonderLandEdge(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for (WonderLandEdge ob : arr) {
            int fs = find(ob.sNode);
            int fe = find(ob.eNode);
            if (fs != fe) {
                answer += ob.cost;
                union(ob.sNode, ob.eNode);
            }
        }

        System.out.println(answer);

    }
}
