package algorithm_practice.fri.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section10_05_02 {
    static int solution(int[] coins, int m, int[] ch) {

        Arrays.fill(ch, Integer.MAX_VALUE);
        Arrays.sort(coins);
        ch[0] = 0;
        for (int coin : coins) {

            for (int i = coin; i <= m; i++) {
                ch[i] = Math.min(ch[i], ch[i - coin] + 1);
            }
        }

        return ch[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ch = new int[m + 1];
        System.out.println(solution(coins, m, ch));
    }
}
