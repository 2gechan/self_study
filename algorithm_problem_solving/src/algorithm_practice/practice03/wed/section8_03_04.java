package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_04 {
    static int N, M;
    static int[] result;

    static void dfs(int l) {
        if (l == M) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= N; i++) {
                result[l] = i;
                dfs(l + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        result = new int[M];
        dfs(0);
    }
}
