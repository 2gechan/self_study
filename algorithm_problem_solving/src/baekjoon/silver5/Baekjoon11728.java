package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11728 {

    static String solution(int N, int M, int[] A, int[] B) {
        int ni = 0;
        int mi = 0;

        StringBuilder sb = new StringBuilder();
        while (ni < N && mi < M) {
            if (A[ni] <= B[mi]) {
                sb.append(A[ni++] + " ");
            }
            else {
                sb.append(B[mi++] + " ");
            }
        }
        if (ni == N) {
            for (int i = mi; i < M; i++) {
                sb.append(B[i] + " ");
            }
        }
        else if (mi == M) {
            for (int i = ni; i < N; i++) {
                sb.append(A[i] + " ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.valueOf(NM[0]);
        int M = Integer.valueOf(NM[1]);
        String[] strA = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(strA[i]);
        }
        String[] strB = br.readLine().split(" ");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.valueOf(strB[i]);
        }
        System.out.println(solution(N, M, A, B));
    }
}
