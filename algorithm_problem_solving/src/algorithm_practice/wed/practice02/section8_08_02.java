package algorithm_practice.wed.practice02;

import java.util.Scanner;

// 수열 추측하기
public class section8_08_02 {

    static boolean flag = false;
    static int n, f;
    static int[][] dy;
    static int[] combination, result, ch;
    static int combi(int r, int c) {
        if (dy[r][c] > 0) return dy[r][c];
        if (r == c || c == 0) return 1;
        else {
            return dy[r][c] = combi(r - 1, c - 1) + combi(r - 1, c);
        }
    }

    static void solution(int l, int sum) {
        if (flag) return;
        if (l == n) {

            if (sum == f) {
                flag = true;
                for (int i = 0; i < n; i++) {
                    System.out.print(result[i] + " ");
                }
            }
        }
        else {

            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) continue;
                ch[i] = 1;
                result[l] = i;
                solution(l + 1, sum + (result[l] * combination[l]));
                ch[i] = 0;
            }
        }
    }

    /*
    3 1 2 4
    3 + 1, 1 + 2, 2 + 4
    3 + 1 + 1 + 2, 1 + 2 + 2 + 4
    3 + 1 + 1 + 2 + 1 + 2 + 2 + 4
    => 3 * 1, 1 * 3, 2 * 3, 4 * 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();

        dy = new int[n][n];
        combination = new int[n];
        result = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            combination[i] = combi(n - 1, i);
        }
        solution(0, 0);
    }
}
