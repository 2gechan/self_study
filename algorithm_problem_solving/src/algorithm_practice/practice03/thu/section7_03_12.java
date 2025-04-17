package algorithm_practice.practice03.thu;

import java.util.*;

public class section7_03_12 {

    static void solution(int n, List<ArrayList<Integer>> list) {

        int[] answer = new int[n + 1];
        Arrays.fill(answer, Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        answer[1] = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int node = queue.poll();
                for (int x : list.get(node)) {
                    if (answer[node] + 1 < answer[x]) {
                        answer[x] = answer[node] + 1;
                        queue.offer(x);
                    }
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + answer[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        solution(n, list);
    }
}
