package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon15649 {

    static int N, M;

    static int[] result, chk;
    static void solution(int l, int cnt) {
         if (l == M) {
             for (int x : result) {
                 System.out.print(x + " ");
             }
             System.out.println();
        } else {

            for (int i = 1; i <= N; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    result[l] = i;
                    solution(l + 1, cnt + 1);
                    chk[i] = 0;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);
        result = new int[M];
        chk = new int[N + 1];
        solution(0, 0);
    }
}
