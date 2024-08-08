package algorithm_practice.tue.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
원더랜드에 문제가 생겼다.
원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
원더랜드는 모든 도시를 서로 연결하면서
최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
첫째 줄에 도시의 개수 V(1≤V≤100)와 도로의 개수 E(1≤E≤1,000)가 주어진다.
다음 E개의 줄에는 각 도로에 대한 정보를 나타내는 세 정수 A, B, C가 주어진다.
이는 A번 도시와 B번 도시가 유지비용이 C인 도로로 연결되어 있다는 의미이다.
 */

class WonderLand2 implements Comparable<WonderLand2> {
    int v;
    int cost;

    public WonderLand2(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(WonderLand2 o) {
        return this.cost - o.cost;
    }
}
public class section9_08_01 {
    static List<ArrayList<WonderLand2>> list = new ArrayList<>();
    static int[] dis;
    static int solution(int v) {
        int answer = 0;

        PriorityQueue<WonderLand2> pQ = new PriorityQueue<>();
        pQ.offer(new WonderLand2(v, 0));
        while (!pQ.isEmpty()) {
            WonderLand2 tmp = pQ.poll(); // 비용이 가장 낮은거 poll
            if (dis[tmp.v] == 0) {
                dis[tmp.v] = 1;
                answer += tmp.cost;
                // 이미 들린 곳은 pQ에 또 넣을 필요 없음
                for (WonderLand2 w : list.get(tmp.v)) {
                    if (dis[w.v] == 0) pQ.offer(w);
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
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.get(a).add(new WonderLand2(b, c));
            list.get(b).add(new WonderLand2(a, c)); // 무방향 그래프이기 때문에 역순으로도 추가 필요
        }
        System.out.println(solution(1));
    }
}
/*
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15
 */