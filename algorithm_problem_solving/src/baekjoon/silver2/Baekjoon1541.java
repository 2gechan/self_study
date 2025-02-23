package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 30-70-20+40-10+100+30-35
        // 30, 70, 20+40, 10+100+30, 35
        String[] sub = br.readLine().split("-");

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < sub.length; i++) {
            int tmp = 0;

            String[] add = sub[i].split("\\+");

            for (int j = 0; j < add.length; j++) {

                tmp += Integer.valueOf(add[j]);
            }

            if (result == Integer.MAX_VALUE) {
                result = tmp;
            }
            else result -= tmp;
        }

        System.out.println(result);

    }
}
