package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1904 {

    static long solution(int N) {

        long[] dy = new long[1000001];
        dy[0] = 0;
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= N; i++) {
            dy[i] = (dy[i - 1] + dy[i - 2]) % 15746;
        }

        return dy[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());
        System.out.println(solution(N));

    }
}
