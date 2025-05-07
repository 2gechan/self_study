package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon14889 {

    static int n, answer = Integer.MAX_VALUE;
    static boolean[] chk;
    static int[][] arr;

    static void solution(int l, int index) {

        if (l == n / 2) {
            int start = 0;
            int link = 0;
            for (int i = 0; i < n; i++) {
                if (chk[i]) {
                    for (int j = 0; j < n; j++) {
                        if (chk[j]) start += arr[i][j];
                    }
                }
                else {
                    for (int j = 0; j < n; j++) {
                        if (!chk[j]) link += arr[i][j];
                    }
                }
            }
            answer = Math.min(answer, Math.abs(start - link));
        }
        else {
            for (int i = index; i < n; i++) {
                if (!chk[i]) {
                    chk[i] = true;
                    solution(l + 1, i + 1);
                    chk[i] = false;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        chk = new boolean[n];
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
