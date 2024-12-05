package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon2693 {

    static int solution(String[] lines) {
        Integer[] arr = new Integer[lines.length];
        for (int i = 0; i < lines.length; i++) {
            arr[i] = Integer.valueOf(lines[i]);
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        return arr[2];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            int answer = solution(lines);
            sb.append(answer + "\n");
        }
        System.out.println(sb.toString());
    }
}
