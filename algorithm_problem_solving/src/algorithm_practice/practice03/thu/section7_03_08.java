package algorithm_practice.practice03.thu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section7_03_08 {

    static int solution(int s, int e, int[] arr) {
        int answer = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int now = queue.poll();
                for (int j = 0; j < arr.length; j++) {
                    if (now + arr[j] <= 0) continue;
                    if (now + arr[j] == e) return answer;
                    queue.offer(now + arr[j]);

                }
            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = {1, -1, 5};
        System.out.println(solution(s, e, arr));
    }
}
