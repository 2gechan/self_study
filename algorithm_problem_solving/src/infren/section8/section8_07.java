package infren.section8;

import java.util.Scanner;

// nCr = n-1Cr-1 + n-1Cr의 공식을 이용한 dfs 알고리즘을 이용해 조합의 경우수(메모리제이션) 구하기
public class section8_07 {
    static int[][] memory = new int[35][35];
    static int dfs(int n, int r) {
        if (memory[n][r] > 0) return memory[n][r];
        if (n == r || r == 0) return 1;
        else {
            return memory[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(dfs(n, r));
    }
}
