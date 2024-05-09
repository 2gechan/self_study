package baekjoon.silver5;

import java.util.*;

public class p11866 {
    static List<Integer> solution(int n, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        int cnt = 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            if (cnt != k) {
                q.offer(x);
                cnt++;
            }
            else {
                result.add(x);
                cnt = 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> result = solution(n, k);
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i + 1 == result.size()) System.out.print(result.get(i));
            else System.out.print(result.get(i) + ", ");
        }
        System.out.println(">");
    }
}
