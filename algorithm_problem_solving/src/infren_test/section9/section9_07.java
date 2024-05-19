package infren_test.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2>{
    int v1;
    int v2;
    int cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost - o.cost;
    }
}

public class section9_07 {

    static ArrayList<Edge2> arr = new ArrayList<>();
    static int[] dis;

    static int find(int v) {
        if (v == dis[v]) return v;
        else return dis[v] = find(dis[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) dis[fa] = fb;
    }

    static int solution(ArrayList<Edge2> arr) {
        int answer = 0;
        Collections.sort(arr);
        for (Edge2 o : arr) {
            int fv1 = find(o.v1);
            int fv2 = find(o.v2);
            if (fv1 != fv2) {
                answer += o.cost;
                union(o.v1, o.v2);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        dis = new int[v + 1];
        for (int i = 1; i<= v; i++) dis[i] = i;
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge2(a, b, c));
        }
        System.out.println(solution(arr));
    }
}
