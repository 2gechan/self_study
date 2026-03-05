package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {
            boolean flag = true;
            char tmp = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) != tmp) {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(tmp);
            else sb.append("?");
        }
        System.out.println(sb.toString());
    }
}
