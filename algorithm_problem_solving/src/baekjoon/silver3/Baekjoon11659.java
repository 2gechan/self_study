package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11659 {

    static int N;
    static long[] sums;
    static int[] arr;
    static void make() {

        long now = 0;
        for (int i = 1; i <= N; i++) {
            now += arr[i - 1];
            sums[i] = now;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        int M = Integer.valueOf(NM[1]);

        arr = new int[N];
        sums = new long[N + 1];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }

        make();

        StringBuilder sb = new StringBuilder();

        for (int z = 0; z < M; z++) {
            String[] ij = br.readLine().split(" ");
            int i = Integer.valueOf(ij[0]);
            int j = Integer.valueOf(ij[1]);
            sb.append((sums[j] - sums[i - 1]) + "\n");
        }
        System.out.println(sb.toString());
    }
}
