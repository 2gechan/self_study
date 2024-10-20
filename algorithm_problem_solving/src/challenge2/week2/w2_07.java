package challenge2.week2;

import java.util.*;

public class w2_07 {

    static int[] distance;
    static boolean[] visit;
    static List<Integer> result;

    static void solution(List<List<Integer>> list, int k, int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        distance[x] = 0;
        visit[x] = true;
        while (!q.isEmpty()) {
            int s = q.poll();

            for (int e : list.get(s)) {
                if (!visit[e]) {
                    visit[e] = true;
                    if (distance[s] + 1 == k) {
                        result.add(e);
                        continue;
                    }
                    distance[e] = distance[s] + 1;
                    q.offer(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 도시의 개수
        int m = sc.nextInt(); // 도로의 개수
        int k = sc.nextInt(); // 거리 정보
        int x = sc.nextInt(); // 출발 도시 번호
        distance = new int[n + 1];
        visit = new boolean[n + 1];
        result = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }

        solution(list, k, x);
        if (result.size() == 0) System.out.println(-1);
        else {
            Collections.sort(result);
            for (int num : result) {
                System.out.println(num);
            }
        }
    }
}
