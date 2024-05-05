package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2751 {
    static void solution(int[] arr) {
        boolean[] ch = new boolean[2000001];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            ch[arr[i] + 1000000] = true;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        solution(arr);
    }
}
