package algorithm_practice.practice03.tue;

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
public class section9_03_08 {

    static int solution(int V, List<ArrayList<Wonderland2>> list) {
        int answer = 0;
        int[] arr = new int[V + 1];
        PriorityQueue<Wonderland2> pQ = new PriorityQueue<>();
        pQ.offer(new Wonderland2(1, 0));
        while (!pQ.isEmpty()) {
            Wonderland2 tmp = pQ.poll();
            if (arr[tmp.v] == 0) {
                arr[tmp.v] = 1;
                answer += tmp.cost;
                for (Wonderland2 w : list.get(tmp.v)) {
                    if (arr[w.v] == 0) pQ.offer(w);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        List<ArrayList<Wonderland2>> list = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            list.get(s).add(new Wonderland2(e, c));
            list.get(e).add(new Wonderland2(s, c));
        }
        System.out.println(solution(V, list));
    }
}
