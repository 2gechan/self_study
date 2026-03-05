package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int len = line.length();

        int result = 0;
        for (int i = 0; i < len; i++) {

            char c = line.charAt(i);

            // c=, c-
            if (c == 'c' && i < len - 1) {
                if (line.charAt(i + 1) == '-' || line.charAt(i + 1) == '=') {
                    i++;
                }
            }

            // dz=, d-
            if (c == 'd' && i < len - 1) {
                if (line.charAt(i + 1) == '-') {
                    i++;
                } else if (i < len - 2) {
                    if (line.charAt(i + 1) == 'z' && line.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }

            // lj
            if (c == 'l' && i < len - 1) {
                if (line.charAt(i + 1) == 'j') {
                    i++;
                }
            }

            // nj
            if (c == 'n' && i < len - 1) {
                if (line.charAt(i + 1) == 'j') {
                    i++;
                }
            }

            // s=
            if (c == 's' && i < len - 1) {
                if (line.charAt(i + 1) == '=') {
                    i++;
                }
            }

            // z=
            if (c == 'z' && i < len - 1) {
                if (line.charAt(i + 1) == '=') {
                    i++;
                }
            }
            result++;
        }
        System.out.println(result);


    }
}
