package infren.section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// dfs를 이용한 최소한의 동전 개수로 거스름돈 맞추기
public class section8_05 {
    static int changes, answer = Integer.MAX_VALUE;
    static Integer[] coins;

    static void dfs(int l, int sum) {
        if (sum > changes) return;
        if(l >= answer) return;
        if (sum == changes) answer = Math.min(answer, l);
        else {
            for (int i = 0; i < coins.length; i++) {
                dfs(l+1, sum + coins[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        changes = sc.nextInt();
        dfs(0, 0);
        System.out.println(answer);
    }
}
