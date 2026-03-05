package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[10000001];
        for (int i = 0; i < n; i++) {
            arr[ Integer.valueOf(br.readLine())]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000000; i++) {

            while (arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}
