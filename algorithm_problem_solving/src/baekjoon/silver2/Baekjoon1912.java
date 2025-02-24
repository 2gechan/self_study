package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int[] dy = new int[n];

        dy[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            dy[i] = Math.max(arr[i], dy[i - 1] + arr[i]);
            max = Math.max(max, dy[i]);
        }

        System.out.println(max);

    }
}
