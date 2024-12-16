package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2740 {

    static long[][] solution(int N, int M, int K, int[][] aArr, int[][] bArr) {
        long[][] result = new long[N][K];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < K; j++) {

                for (int k = 0; k < M; k++) {

                    result[i][j] += aArr[i][k] * bArr[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aNM = br.readLine().split(" ");
        int aN = Integer.valueOf(aNM[0]);
        int aM = Integer.valueOf(aNM[1]);
        int[][] aArr = new int[aN][aM];
        for (int i = 0; i < aN; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < aM; j++) {
                aArr[i][j] = Integer.valueOf(row[j]);
            }
        }
        String[] bNM = br.readLine().split(" ");
        int bM = Integer.valueOf(bNM[0]);
        int bK = Integer.valueOf(bNM[1]);
        int[][] bArr = new int[bM][bK];
        for (int i = 0; i < bM; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < bK; j++) {
                bArr[i][j] = Integer.valueOf(row[j]);
            }
        }
        long[][] result = solution(aN, aM, bK, aArr, bArr);
        for(int i = 0; i < aN; i++) {
            for (int j = 0; j < bK; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
