package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver18110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        double dN = n * 0.15;
        int round = Integer.parseInt(String.valueOf(Math.round(dN)));

        double sum = 0.0;
        for (int i = round; i < n - round; i++) {
            sum += arr[i];
        }
        double cnt = n - (round * 2);

        long result = Math.round(sum / cnt);

        System.out.println(result);

    }
}
