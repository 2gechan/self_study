package algorithm_practice.thu.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Wonderland2 implements Comparable<Wonderland2> {
    int v;
    int cost;

    public Wonderland2(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Wonderland2 o) {
        return this.cost - o.cost;
    }
}
public class section9_08_02 {
    static List<List<Wonderland2>> list;
    static boolean[] dis;
    static int solution(int v) {
        int answer = 0;
        PriorityQueue<Wonderland2> pQ = new PriorityQueue<>();
        pQ.offer(new Wonderland2( v, 0));

        while (!pQ.isEmpty()) {
            Wonderland2 tmp = pQ.poll();
            if (!dis[tmp.v]) {
                dis[tmp.v] = true;
                answer += tmp.cost;
                for (Wonderland2 w : list.get(tmp.v)) {
                    if (!dis[w.v]) pQ.offer(w);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        dis = new boolean[v + 1];
        list = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            list.get(start).add(new Wonderland2(end, cost));
            list.get(end).add(new Wonderland2(start, cost));
        }
        System.out.println(solution(1));
    }
}
