package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon5567 {
    static int depth = 2;

    static int solution(int n, List<ArrayList<Integer>> list) {

        int answer = 0;
        boolean[] visit = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visit[1] = true;
        int lvl = 0;
        while (!queue.isEmpty() && lvl < depth) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int now = queue.poll();
                for (int x : list.get(now)) {
                    if (!visit[x]) {
                        visit[x] = true;
                        answer++;
                        queue.offer(x);
                    }
                }
            }

            lvl++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int m = Integer.valueOf(br.readLine());
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f1 = Integer.valueOf(st.nextToken());
            int f2 = Integer.valueOf(st.nextToken());
            list.get(f1).add(f2);
            list.get(f2).add(f1);
        }
        System.out.println(solution(n, list));
    }
}
