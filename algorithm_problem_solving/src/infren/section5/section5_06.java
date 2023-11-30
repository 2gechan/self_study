package infren.section5;

import java.util.*;

// 공주 구하기
// n명의 왕자들이 돌아가며 k번째 자리에 있으면 제외된다.
// 순차적으로 회전하는 방식은 q를 이용할 것
// ex n = 8, k = 3 이면, 1 2 3 4 5 6 7 8
// 3번이 제외되고 이어서 6이 제외되고 1이 제외되고 이런식으로 진행된다.
public class section5_06 {
    // 8 3
    static int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        int index = 1;
        while (q.size() > 1) {
            if (index % k == 0) q.poll();
            else {
                q.offer(q.poll());
            }
            index++;
        }
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
