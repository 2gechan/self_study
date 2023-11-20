package infren.section7;

import java.util.Scanner;

public class section7_06 {
    static int n;
    static int[] ch;

    static void dfs(int l) {
        if (l == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += i + " ";
                }
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[l] = 1;
            dfs(l + 1);
            ch[l] = 0;
            dfs(l + 1);
        }

    }
    // n의 모든 부분 집합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = 3;
        ch = new int[n + 1];
        dfs(1);
    }
}
