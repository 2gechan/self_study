package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10819 {
    static boolean[] visit;
    static int[] arr, result;
    static int N, answer = 0;

    static void solution(int l) {
        if (l == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(result[i] - result[i + 1]);
            }
            answer = Math.max(answer, sum);
        }
        else {
            for (int i = 0; i < N; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    result[l] = arr[i];
                    solution(l + 1);
                    visit[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        arr = new int[N];
        result = new int[N];
        visit = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        solution(0);
        System.out.println(answer);
    }
}
