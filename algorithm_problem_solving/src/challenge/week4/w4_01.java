package challenge.week4;

import java.util.*;

public class w4_01 {

    static int solution(int n, List<List<Integer>> list) {
        int answer = 0;

        boolean[] chk = new boolean[n + 1]; // 감염된 컴퓨터들을 체크할 배열
        chk[1] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1); // 1번 컴퓨터는 감염된 상태
        while (!q.isEmpty()) {
            int comNum = q.poll();
            for (int x : list.get(comNum)) { // 감염된 컴퓨터와 네트워크 상으로 연결된 컴퓨터들
                // 이미 감염된 컴퓨터는 skip
                if (chk[x] == false) {
                    chk[x] = true;
                    q.offer(x);
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        System.out.println(solution(n, list));
    }
}
