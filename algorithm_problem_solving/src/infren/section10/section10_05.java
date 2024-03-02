package infren.section10;

import java.util.Arrays;
import java.util.Scanner;

// 거스름돈을 최소 동전 개수로 주기(냅색 알고리즘)
public class section10_05 {
    static int [] dy;
    static int n, m;
    static int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(solution(coin));

    }
}
