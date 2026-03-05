package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int num = 666;

        StringBuilder sb = new StringBuilder();
        while (true) {
            if (String.valueOf(num).contains("666")) cnt++;

            if (cnt == n) {
                sb.append(num);
                break;
            }
            num++;
        }
        System.out.println(sb.toString());

    }
}
