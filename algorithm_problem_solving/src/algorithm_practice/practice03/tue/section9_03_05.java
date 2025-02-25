package algorithm_practice.practice03.tue;

import java.util.*;

class Node implements Comparable<Node> {
    int e;
    int cost;

    public Node(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return this.cost - o.cost;
    }
}
public class section9_03_05 {

    static int[] solution(int n, List<List<Node>> list) {

        int[] answer = new int[n + 1];
        Arrays.fill(answer, Integer.MAX_VALUE);

        PriorityQueue<Node> pQ = new PriorityQueue<>();

        pQ.offer(new Node(1, 0)); // 1번 정점에 가는데 cost 는 0
        answer[1] = 0;
        while (!pQ.isEmpty()) {
            Node tmp = pQ.poll();

            int now = tmp.e;
            int nowCost = tmp.cost;

            if (nowCost > answer[now]) continue; // 이미 방문했으나 이전 값이 더 최소비용일 경우

            for (Node node : list.get(now)) {
                if (nowCost + node.cost < answer[node.e]) {
                    answer[node.e] = nowCost + node.cost;
                    pQ.offer(new Node(node.e, answer[node.e]));
                }

            }
        }

        return answer;

    }
    /*
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Node>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int cost = sc.nextInt();
            list.get(s).add(new Node(e, cost));
        }

        int[] result = solution(n, list);

        for (int i = 2; i <= n; i++) {
            if (result[i] == Integer.MAX_VALUE) System.out.println(i + " : impossible");
            else System.out.println(i + " : " + result[i]);
        }

    }
}
