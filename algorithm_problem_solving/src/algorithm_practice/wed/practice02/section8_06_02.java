package algorithm_practice.wed.practice02;

import java.util.Scanner;

// 순열 구하기
public class section8_06_02 {

    static int n, m;
    static int[] arr, ch, result;

    static void dfs(int l) {
        if (l == m) {
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 1) continue;
                ch[i] = 1;
                result[l] = arr[i];
                dfs(l + 1);
                ch[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
    }
}
