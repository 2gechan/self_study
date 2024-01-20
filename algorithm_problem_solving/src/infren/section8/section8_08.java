package infren.section8;

import java.util.Scanner;

// dfs를 이용한 n을 더해 가며 f값이 만들어지는 수열 추측하기
public class section8_08 {
    static int[] b, p, ch;
    static int n, f;
    static boolean flag = false;
    static int[][] arr = new int[35][35];
    static int combi(int n, int r) {
        if (arr[n][r] > 0) return arr[n][r];
        if (n == r || r == 0) return 1;
        else return combi(n - 1, r - 1) + combi(n - 1, r);
    }

    static void dfs(int l, int sum) {
        if (flag) return;
        if(l == n){
            if(sum == f){
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[l] = i;
                    dfs(l + 1, sum + (p[l] * b[l]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        dfs(0, 0);
    }
}
