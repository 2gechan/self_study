package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11727 {

    static long solution(int N) {
        long[] tiles = new long[1001];

        tiles[1] = 1;
        tiles[2] = 3;
        for (int i = 3; i <= N; i++) {
            tiles[i] = (tiles[i - 1] + tiles[i - 2] * 2) % 10007;
        }

        return tiles[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(solution(N));
    }
}
