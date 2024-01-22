package infren.section8;

import java.util.Scanner;

// n개의 번호중 m개의 숫자를 뽑는 조합 구하기 dfs 알고리즘
public class section8_09 {
    static int n, m;
    static int[] ch;
    static int[][] arr;
    static void dfs(int l, int s) {
        if(l == m) {
            int x, y;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            for (int i = s; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    dfs(l + 1, i + 1);
                    ch[i] = 0;
                }

            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        arr = new int[11][11];
        dfs(0, 1);
    }
}
