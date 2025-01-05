package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon1026 {

    static int solution(int N, Integer[] A, Integer[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        Integer[] A = new Integer[N];
        String[] a = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(a[i]);
        }
        Integer[] B = new Integer[N];
        String[] b = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.valueOf(b[i]);
        }
        System.out.println(solution(N, A, B));
    }
}
