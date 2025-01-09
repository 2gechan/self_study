package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1003 {

    static int[] solution(int N) {
        int[] result = new int[2];

        int[] zero = new int[N + 1];
        int[] one = new int[N + 1];

        if (N == 0 || N == 1) {
            result[N] = 1;
            return result;
        }
        zero[0] = 1;
        one[1] = 1;
        for (int i = 2; i <= N; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }
        result[0] = zero[N];
        result[1] = one[N];

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();

        int T = Integer.valueOf(br.readLine());

        while (T-- > 0) {
            int N = Integer.valueOf(br.readLine());
            int[] result = solution(N);
            answer.append(result[0] + " " + result[1] + "\n");
        }
        System.out.println(answer);
    }
}
