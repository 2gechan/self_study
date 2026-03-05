package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    int sum = Integer.valueOf(c) + 13;
                    if (sum > 90) {
                        sum = sum - 90 + 64;
                    }
                    sb.append((char) sum);
                } else {
                    int sum = Integer.valueOf(c) + 13;
                    if (sum > 122) {
                        sum = sum - 122 + 96;
                    }
                    sb.append((char) sum);
                }
            } else sb.append(c);

        }
        // a : 97, z : 122, A : 65, Z : 90
        System.out.println(sb.toString());

    }
}
