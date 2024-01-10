package infren.section8;

import java.util.Scanner;

// dfs를 이용한 중복순열 구하기
public class section8_04 {
    static int n, m;
    static int[] ch;
    static void dfs(int x) {
        if (x == m) {
            System.out.println(ch[0] + " " + ch[1]);
        }
        else {
            for (int i = 1; i <= n; i++) {
                ch[x] = i;
                dfs(x + 1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        dfs(0);
    }
}
