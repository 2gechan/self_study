package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1929 {

    static String solution(int M, int N) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[N + 1];
        arr[0] = arr[1] = true;
        for (int j = 2; j <= Math.sqrt(N); j++) {

            if (arr[j]) continue;
            for (int k = j * j; k <= N; k += j) {
                arr[k] = true;
            }
        }
        for (int i = M; i <= N; i++) {

            if (!arr[i]) sb.append(i + "\n");

        }


        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int M = Integer.valueOf(NM[0]);
        int N = Integer.valueOf(NM[1]);
        System.out.println(solution(M, N));
    }
}
