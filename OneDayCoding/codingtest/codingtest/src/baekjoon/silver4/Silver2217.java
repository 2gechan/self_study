package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Silver2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] ropes = new Integer[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes, Comparator.reverseOrder());

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, ropes[i] * (i + 1));
        }
        System.out.println(max);
    }
}
