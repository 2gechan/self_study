package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15666 {

    static int n, m;
    static int[] arr, result;
    static void solution(int l) {
        if (l == m) {
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            int before = 0;
            for (int i = 0; i < n; i++) {
                if (before == arr[i]) continue;
                if (l > 0) if (result[l - 1] > arr[i]) continue;
                before = arr[i];
                result[l] = arr[i];
                solution(l + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.valueOf(st.nextToken());
        m = Integer.valueOf(st.nextToken());
        arr = new int[n];
        result = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr);
        solution(0);
    }
}
