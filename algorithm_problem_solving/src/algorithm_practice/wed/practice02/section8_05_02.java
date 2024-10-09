package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section8_05_02 {

    static int n, m, answer = Integer.MAX_VALUE;
    static int[] coins;
    static void solution(int count, int sum) {
        if (sum >= m) {
            if (sum == m) answer = Math.min(answer, count);
        }
        else {
            for (int i = 0; i < n; i++) {
                solution(count + 1, sum + coins[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        m = sc.nextInt();
        solution(0, 0);
        System.out.println(answer);
    }
}
