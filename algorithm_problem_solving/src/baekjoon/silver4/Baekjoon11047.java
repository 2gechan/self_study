package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11047 {
    static int solution(int K, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (sum + arr[i] <= K) {
                sum += arr[i];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.valueOf(line[0]);
        int K = Integer.valueOf(line[1]);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        System.out.println(solution(K, arr));
    }
}
