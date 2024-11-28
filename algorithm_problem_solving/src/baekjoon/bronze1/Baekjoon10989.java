package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(br.readLine());
            arr[num]++;
        }

        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            int cnt = arr[i];
            for (int j = 0; j < cnt; j++) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}
