package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bronze2309 {

    static int[] arr;
    static boolean[] chk = new boolean[10];
    static boolean flag = false;

    static void dfs(int l, int sum) {

        if (flag) return;
        if (l == 7) {
            if (sum == 100) {
                flag = true;
                for (int i = 0; i < 9; i++) {
                    if (chk[i]) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
        else {
            for (int i = l; i < 9; i++) {

                if (!chk[i]) {
                    chk[i] = true;
                    dfs(l + 1, sum + arr[i]);
                    chk[i] = false;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(arr);

        dfs(0, 0);
    }
}
