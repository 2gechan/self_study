package algorithm_practice.practice03.fri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_03_06 {
    static int solution(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            cnt++;
            Integer num = queue.poll();
            if (cnt == k) {
                cnt = 0;
                continue;
            }
            queue.offer(num);
        }

        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
