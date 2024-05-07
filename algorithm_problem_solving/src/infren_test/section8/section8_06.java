package infren_test.section8;

import java.util.Scanner;

public class section8_06 {
    static int n, m;
    static int[] ch, result;
    static void dfs(int[] arr, int l) {
        if (l == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    result[l] = arr[i];
                    dfs(arr, l + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        ch = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(arr, 0);
    }
}
