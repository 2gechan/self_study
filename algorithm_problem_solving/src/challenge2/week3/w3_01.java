package challenge2.week3;

import java.util.*;

class BusInfo implements Comparable<BusInfo>  {
    int city;
    int cost;

    public BusInfo(int city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    @Override
    public int compareTo(BusInfo o) {
        return this.cost - o.cost;
    }
}

public class w3_01 {
    static int[] result;

    static void solution(List<List<BusInfo>> list, int s, int e) {

        Arrays.fill(result, Integer.MAX_VALUE);
        PriorityQueue<BusInfo> pQ = new PriorityQueue<>();
        pQ.offer(new BusInfo(s, 0));
        result[s] = 0;
        while (!pQ.isEmpty()) {
            BusInfo tmp = pQ.poll();
            int now = tmp.city;
            int nowCost = tmp.cost;
            if (now == e) return;
            for (BusInfo bus : list.get(now)) {
                // 이전에 들린적이 있다면, 현재 경로로 가는 것보다 비용이 큰지 확인
                if (result[bus.city] > nowCost + bus.cost) {
                    result[bus.city] = nowCost + bus.cost;
                    pQ.offer(new BusInfo(bus.city, nowCost + bus.cost));
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        result = new int[n + 1];
        List<List<BusInfo>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int cost = sc.nextInt();
            list.get(s).add(new BusInfo(e, cost));
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        solution(list, s, e);
        System.out.println(result[e]);
    }
}
