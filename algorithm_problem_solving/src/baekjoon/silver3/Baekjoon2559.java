package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2559 {

    static long solution(int N, int K, int[] arr) {
        long answer = 0;

        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        answer = sum;

        int lt = 0;
        for (int rt = K; rt < N; rt++) {
            sum = sum + arr[rt] - arr[lt++];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int N = Integer.valueOf(NK[0]);
        int K = Integer.valueOf(NK[1]);
        int[] arr = new int[N];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }
        System.out.println(solution(N, K, arr));
    }
}
