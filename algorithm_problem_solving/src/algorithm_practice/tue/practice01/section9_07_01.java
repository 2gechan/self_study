package algorithm_practice.tue.practice01;

import java.util.*;

/*
원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
원더랜드에 문제가 생겼다.
원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
원더랜드는 모든 도시를 서로 연결하면서
최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
첫째 줄에 도시의 개수 V(1≤V≤100)와 도로의 개수 E(1≤E≤1,000)가 주어진다.
다음 E개의 줄에는 각 도로에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다.
이는 A번 도시와 B번 도시가 유지비용이 C인 도로로 연결되어 있다는 의미이다.
 */
class WonderLand implements Comparable<WonderLand> {
    int start;
    int end;
    int cost;

    @Override
    public int compareTo(WonderLand o) {
        return this.cost - o.cost;
    }

    public WonderLand(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}
public class section9_07_01 {
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

    static int solution(ArrayList<WonderLand> list) {
        int answer = 0;
        Collections.sort(list);
        for (WonderLand w : list) {
            int fa = find(w.start);
            int fb = find(w.end);
            if (fa != fb) {
                answer += w.cost;
                union(w.start, w.end);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        dis = new int[v + 1];

        for (int i = 0; i < dis.length; i++) dis[i] = i;

        ArrayList<WonderLand> list = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new WonderLand(a, b, c));
        }
        System.out.println(solution(list));
    }
}
