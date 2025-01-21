package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon15654 {

    static int N, M;
    static int[] arr, result, ch;
    static void solution(int l, int index) {
        if (l == M) {

            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < N; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    result[l] = arr[i];
                    solution(l + 1, index + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.valueOf(NM[0]);
        M = Integer.valueOf(NM[1]);
        result = new int[M];
        ch = new int[N];
        arr = new int[N];

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }
        Arrays.sort(arr);
        solution(0, 0);
    }
}
