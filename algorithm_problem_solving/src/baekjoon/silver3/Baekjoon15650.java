package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon15650 {

    static int N, M;
    static int[] result;

    static void solution(int l, int index) {

        if (l == M) {

            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
        else {

            for (int i = index; i <= N; i++) {
                result[l] = i;
                solution(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);
        result = new int[M];
        solution(0, 1);
    }
}
