package baekjoon.practice;

import java.util.Scanner;

public class p2501 {
    static int solution(int n, int k) {
        int answer = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
            if (cnt == k) {
                answer = i;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
