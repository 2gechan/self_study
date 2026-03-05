package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bronze2609 {

    static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.valueOf(line.split(" ")[0]);
        int b = Integer.valueOf(line.split(" ")[1]);

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println((a * b) / d);
    }
}
