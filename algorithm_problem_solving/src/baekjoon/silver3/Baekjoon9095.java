package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9095 {
    static int solution(int N) {

        int[] arr = new int[N + 1];
        if (N >= 1) arr[1] = 1;
        if (N >= 2) arr[2] = 2;
        if (N >= 3) arr[3] = 4;

        for (int i = 4; i <= N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        return arr[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.valueOf(br.readLine());
            int answer = solution(N);
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
}
