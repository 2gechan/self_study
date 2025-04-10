package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int[] answer = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int j = 1;
            // 2 1 1 0
            // 4 2 1 3
            while (true) {
                if (arr[i] == 0 && answer[j] == 0) {
                    answer[j] = i;
                    break;
                }
                else if (answer[j] == 0) arr[i]--;

                j++;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
