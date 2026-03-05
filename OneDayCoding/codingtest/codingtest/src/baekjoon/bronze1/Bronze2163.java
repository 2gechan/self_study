package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        StringBuilder sb = new StringBuilder();
        if (n == 1 && m == 1) sb.append(0);
        else sb.append(n * m - 1);
        System.out.println(sb.toString());
    }
}
