package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon24479 {

    static List<ArrayList<Integer>> list = new ArrayList<>();
    static int[] result;
    static boolean[] visit;
    static int n, cnt = 1;

    static void solution(int r) {

        visit[r] = true;
        result[r] = cnt++;

        for (int s : list.get(r)) {
            if (!visit[s]) solution(s);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int r = Integer.valueOf(st.nextToken());
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        visit = new boolean[n + 1];
        result = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.valueOf(st.nextToken());
            int e = Integer.valueOf(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(list.get(i));
        }

        solution(r);
        for (int i = 1; i <= n; i++) System.out.println(result[i]);
    }
}
