package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.valueOf(nk[0]);
        int k = Integer.valueOf(nk[1]);
        int[] arr = new int[n];
        String[] tc = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(tc[i]);
        }
        Arrays.sort(arr);

        System.out.println(arr[k - 1]);

    }
}
