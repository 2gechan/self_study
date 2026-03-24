package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] result = new String[s.length()];

        int index = 0;
        while (s.length() > 0) {
            result[index++] = s;
            s = s.substring(1);
        }

        Arrays.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
