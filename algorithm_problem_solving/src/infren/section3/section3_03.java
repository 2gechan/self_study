package infren.section3;

import java.util.Scanner;

public class section3_03 {
    static int solution(int n, int k, int[] t) {
        int max = 0, answer = 0;
        for (int i = 0; i < k; i++) max += t[i];
        answer = max;
        for (int i = k; i < n; i++) {
            // 한개를 더하고 맨앞숫자를 빼는 방식으로 n의 2제곱 시간 복잡도보다 나음
            // 슬라이드 윈도우 방식
            max += (t[i] - t[i - k]);
            answer = Math.max(answer, max);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, t));
    }
}
