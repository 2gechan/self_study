package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2839 {
    static int solution(int N) {
        int[] arr = new int[5001];
        // 3, 5
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[3] = 1;
        arr[5] = 1;

        for (int i = 6; i <= N; i++) {
            if (arr[i - 5] != Integer.MAX_VALUE) {
                arr[i] = Math.min(arr[i], arr[i - 5] + 1);
            }
            if (arr[i - 3] != Integer.MAX_VALUE) {
                arr[i] = Math.min(arr[i], arr[i - 3] + 1);
            }

        }

        if (arr[N] == Integer.MAX_VALUE) return -1;
        else return arr[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        System.out.println(solution(N));
    }
}
