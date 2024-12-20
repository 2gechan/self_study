package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[8];
        for (int i = 0; i < 8; i++) {
            score[i] = Integer.valueOf(br.readLine());
        }
        int[] tmp = score.clone();
        Arrays.sort(tmp);
        int max = 0;
        int[] result = new int[5];
        int index = 0;

        for (int i = 7; i >= 3; i--) {
            max += tmp[i];
            for (int j = 0; j < 8; j++) {
                if (tmp[i] == score[j]) {
                    result[index++] = j + 1;
                    break;
                }
            }
        }
        Arrays.sort(result);

        System.out.println(max);
        for (int i : result) System.out.print(i + " ");
    }
}
