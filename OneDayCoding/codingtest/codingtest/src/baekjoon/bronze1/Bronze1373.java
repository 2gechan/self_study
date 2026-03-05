package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1373 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringBuilder sb = new StringBuilder(line);
        String[] reverse = sb.reverse().toString().split("");
        int sum = 0;
        int index = 1;
        StringBuilder result = new StringBuilder();
        for (String s : reverse) {

            if (Integer.valueOf(s) == 1) {
                sum += index;
            }
            index *= 2;
            if (index == 8) {
                index = 1;
                result.append(sum).append("");
                sum = 0;
            }
        }
        if (index != 1) result.append(sum);
        System.out.println(result.reverse().toString());


    }
}
