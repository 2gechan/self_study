package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");

            StringBuilder sb;
            for (int i = 0; i < line.length; i++) {
                sb = new StringBuilder(line[i]);
                result.append(sb.reverse()).append(" ");
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }
}
