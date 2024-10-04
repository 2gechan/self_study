package algorithm_practice.fri.practice02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_06_02 {
    static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int count = 0;
        while (q.size() > 1) {
            int tmp = q.poll();
            count++;
            if (count == k) count = 0;
            else {
                q.offer(tmp);
            }
        }
        answer = q.poll();

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
