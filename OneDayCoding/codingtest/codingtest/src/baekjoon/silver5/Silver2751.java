package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        boolean[] chk = new boolean[2000001];
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(br.readLine());
            chk[num + 1000000] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chk.length; i++) {
            if (chk[i]) sb.append(i - 1000000).append("\n");
        }
        System.out.println(sb.toString());
    }
}
