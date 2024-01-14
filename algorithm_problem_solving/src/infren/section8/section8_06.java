package infren.section8;

import java.util.Scanner;

// dfs를 이용한 n개의 수에서 m개의 수를 뽑는 모든 경우의 수 구하기
public class section8_06 {
    static int n, m;
    static int[] arr, ch, answer;
    static void dfs(int x) {
        if (x == m) {
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i]+ " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    answer[x] = arr[i];
                    dfs(x + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        answer = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
    }
}
