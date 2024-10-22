package algorithm_practice.tue.practice02;

import java.util.Scanner;

// 부분집합 구하기(DFS)
public class section7_06_02 {
    static int n;
    static int[] result;
    static void dfs(int l) {
        if (l == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (result[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            result[l] = 1;
            dfs(l + 1);
            result[l] = 0;
            dfs(l + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = new int[n + 1];
        dfs(1);
    }
}
