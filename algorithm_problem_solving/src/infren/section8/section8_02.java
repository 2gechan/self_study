package infren.section8;

import java.util.Scanner;

// W를 넘지않으면서 최대한 많은 수를 포함시키고 가장 큰 수 찾기
public class section8_02 {
    static int w, n, max = 0;
    static int[] arr;
    static void dfs(int x, int sum) {
        if (sum > w) return;
        if (x == n) {
            max = Math.max(sum, max);
        }
        else {
            dfs(x + 1, arr[x] + sum); // 포함한다.
            dfs(x + 1, sum); // 포함하지 않는다.
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0);
        System.out.println(max);
    }
}
