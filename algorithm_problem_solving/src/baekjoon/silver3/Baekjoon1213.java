package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon1213 {

    static String solution(String line) {
        String answer = "I'm Sorry Hansoo";

        int[] arr = new int['Z' - 'A' + 1];

        for (int i = 0; i < line.length(); i++) {
            int index = line.charAt(i) - 'A';
            arr[index]++;
        }

        int cnt = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                cnt++;
                pos = i;
            }
            if (cnt >= 2) return answer;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }
        answer = sb.toString();
        if (cnt > 0) answer += (char) (pos + 'A');
        answer += sb.reverse().toString();

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String line = br.readLine();

        // System.out.println(solution(line));

    }
}
