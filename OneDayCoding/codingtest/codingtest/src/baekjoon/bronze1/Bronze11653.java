package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze11653 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int n = Integer.valueOf(strN);

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}
