package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon15657 {


    static int N, M;
    static int[] arr, result;
    static StringBuilder sb = new StringBuilder();
    static void solution(int l, int index) {
        if (l == M) {
            for (int x : result) {
                sb.append(x + " ");
            }
            sb.append("\n");
        }
        else {
            for (int i = index; i < N; i++) {

                result[l] = arr[i];
                solution(l + 1, i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);

        String[] line = br.readLine().split(" ");
        arr = new int[N];
        result = new int[M];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            result[0] = arr[i];
            solution(1, i);
        }
        System.out.println(sb.toString());
    }
}
