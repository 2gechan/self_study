package infren_test.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_06 {
    static int solution(int n, int k) {
        int answer = 0;
        int index = 1;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        while (q.size() > 1) {
            int num = q.poll();
            if (index == k) {
                index = 0;
            }
            else {
                q.offer(num);
            }
            index++;
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
