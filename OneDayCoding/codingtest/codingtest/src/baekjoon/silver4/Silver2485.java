package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2485 {

    static int gcd(int A, int B) {

        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }

        return A;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            gcd = gcd(arr[i + 1] - arr[i], gcd);
        }

        System.out.println(((arr[n - 1] - arr[0]) / gcd + 1) - n);
    }
}
