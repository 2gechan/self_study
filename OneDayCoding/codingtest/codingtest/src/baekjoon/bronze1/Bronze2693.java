package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[st.countTokens()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[7]).append("\n");
        }
        System.out.println(sb.toString());

    }
}
