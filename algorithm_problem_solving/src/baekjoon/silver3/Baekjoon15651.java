package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon15651 {

    static int N, M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    static void solution(int l) {
        if (l == M) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            for (int i = 1; i <= N; i++) {
                result[l] = i;
                solution(l + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);
        result = new int[M];
        solution(0);
        System.out.println(sb.toString());
    }
}
