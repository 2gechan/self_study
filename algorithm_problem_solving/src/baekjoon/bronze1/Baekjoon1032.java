package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1032 {

    static String solution(String[] arr) {

        if (arr.length == 1) return arr[0];

        int length = arr[0].length();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < length) {

            boolean flag = true;
            char c = arr[0].charAt(index);
            for (int i = 1; i < arr.length; i++) {
                if (c != arr[i].charAt(index)) {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(c);
            else sb.append("?");
            index++;
        }
        if (sb.length() == 0) sb.append("?".repeat(arr[0].length()));

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        System.out.println(solution(arr));
    }
}
