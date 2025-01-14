package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9461 {

    static long[] dy;
    static void make() {

        dy[1] = 1;
        dy[2] = 1;
        dy[3] = 1;

        for (int i = 4; i <= 100; i++) {
            dy[i] = dy[i - 2] + dy[i - 3];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        dy = new long[101];
        make();
        while (T-- > 0) {
            int N = Integer.valueOf(br.readLine());
            long answer = dy[N];
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
}
