package infren_test.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class section8_05 {
    static int answer = Integer.MAX_VALUE, money;

    static void dfs(Integer[] coins, int m, int cnt) {
        if (m > money) return;
        if (cnt > answer) return;
        if (m == money) answer = Math.min(cnt, answer);
        else {
            for (int i = 0; i < coins.length; i++) {
                dfs(coins, m + coins[i], cnt + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] coins = new Integer[n];
        String[] tc = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(tc[i]);
        }
        Arrays.sort(coins, Collections.reverseOrder());
        money = Integer.parseInt(br.readLine());
        dfs(coins, 0, 0);
        System.out.println(answer);
    }
}
